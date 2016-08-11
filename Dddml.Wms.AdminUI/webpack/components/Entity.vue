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
                    <a v-link="{ name: 'aggregate', params: { name: $route.params.name } }">{{$route.params.name}}</a>
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
                    <div class="form-group" v-for="(key, field) in entity">
                        <label class="col-sm-2 control-label">{{ key }}</label>
                        <div class="col-sm-10">
                            <span class="form-control">{{field}}</span>
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
                        <li role="presentation" data-toggle="tab" v-for="(key, item) in children">
                            <a href="javascript:;" v-on:click="changeChild(key)">{{key}}</a>
                        </li>
                    </ul>
                </div>
                <div class="box-body">
                    <v-table :columns="currentChild.columns" :rows="currentChild.data"></v-table>
                </div>
            </div>
        </section>
    </div>
</template>
<style>
</style>
<script>
    import VTable from './Bootstrap/Table.vue'
    export default{
        data(){
            return {
                entity: {},
                children: {},
                currentChild: {}
            }
        },
        components: {
            VTable
        },
        methods: {
            changeChild(key){
                this.currentChild = this.children[key];
            }
        },
        route: {
            data(){
                this.$http.get(this.$route.params.name + '/' + this.$route.params.id).then((response) => {
//                    this.entity = response.data;
                    let data = {};
                    let children = {};
                    for (let key in response.data) {
                        if (!(response.data[key] instanceof Array)) {
                            data[key] = response.data[key];
                        } else {
                            children[key] = {
//                                columns: [],
//                                data: {}
                            };
                            let row = response.data[key][0];
                            if (row) {
                                let columns = [];
                                for (let key in row) {
                                    columns.push(key);
                                }
                                children[key].columns = columns;
                                children[key].data = response.data[key];
                            }
                        }
                    }
                    this.entity = data;
                    this.children = children;
                }, (response) => {
                    // error callback
                });
            }
        }
    }
</script>
