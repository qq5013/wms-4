<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                {{$route.params.name}}:{{$route.params.id}}
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li>
                    <a v-link="{ name: 'entities', params: { name: $route.params.name } }">{{$route.params.name}}</a>
                </li>
                <li class="active">{{$route.params.id}}</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">标题</h3>
                </div>
                <div class="box-body form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">{{metadata.id.name}}</label>
                        <div class="col-sm-10">
                            <span class="form-control">{{entity.data[metadata.id.name]}}</span>
                        </div>
                    </div>
                    <div class="form-group" v-for="field in entity.getFields()">
                        <label class="col-sm-2 control-label">{{ field }}</label>
                        <div class="col-sm-10">
                            <span class="form-control">{{entity.data[field]}}</span>
                        </div>
                    </div>
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    脚部
                </div>
                <!-- /.box-footer-->
            </div>
            <!-- /.box -->
            <div class="box">
                <div class="box-header with-border nav-tabs-custom">
                    <ul class="nav nav-tabs">
                        <li role="presentation" data-toggle="tab" v-for="item in entity.getChildEntityMetadataNames()">
                            <a href="javascript:;" v-on:click="changeChild(item)">{{item}}</a>
                        </li>
                    </ul>
                </div>
                <div class="box-body no-padding table-responsive">
                    <v-table :table-data="currentChild"></v-table>
                </div>
            </div>
        </section>
    </div>
</template>
<style>
</style>
<script>
    import VTable from './Bootstrap/Table.vue'
    import Table from '../src/Table';
    import AggregateCollection from '../src/AggregateCollection';
    import Aggregate from '../src/Aggregate';
    import StringHelper from '../src/StringHelper';

    export default{
        data(){
            return {
                entity: new Aggregate({}, {}),
                children: {},
                currentChild: new Table()
            }
        },
        components: {
            VTable
        },
        props: {
            metadata: Object
        },
        methods: {
            changeChild(key){
                this.currentChild = this.children[key];
            }
        },
        route: {
            data(){
                this.$http.get(this.$route.params.name + '/' + this.$route.params.id).then((response) => {
                    let children = {};
                    this.entity = new Aggregate(response.data, this.metadata);

                    let names = this.entity.getChildEntityMetadataNames();

                    for (let i = 0; i < names.length; i++) {
                        let name = names[i];
                        let entities = new AggregateCollection(
                                this.entity.data[StringHelper.lcfirst(name)],
                                this.entity.getChildEntityMetadata(name)
                        );
                        children[name] = entities.toTable();
                    }

                    this.children = children;
                }, (response) => {
                    // error callback
                });
            }
        }
    }
</script>
