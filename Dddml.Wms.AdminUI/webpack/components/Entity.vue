<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                {{$route.params.name}}:{{$route.params.id}}
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a v-link="{ name: 'aggregate', params: { name: $route.params.name } }">{{$route.params.name}}</a></li>
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
                <div class="box-body form-horizontal" v-for="(key, field) in entity">
                    <div class="form-group">
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

        </section>
    </div>
</template>
<style>
</style>
<script>
    export default{
        data(){
            return {
                entity: {}
            }
        },
        components: {},
        route: {
            data(){
                this.$http.get(this.$route.params.name + '/' + this.$route.params.id).then((response) => {
                    this.entity = response.data;
                }, (response) => {
                    // error callback
                });
            }
        }
    }
</script>
