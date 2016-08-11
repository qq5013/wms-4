<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                空白页面演示
                <small>最基本的结构模板</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="#">页面演示</a></li>
                <li class="active">空白页面</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">标题</h3>
                </div>
                <div class="box-body form-horizontal" v-for="field in fields">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">{{ field }}</label>
                        <div class="col-sm-10">
                            <span class="form-control">{{entity[field]}}</span>
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
            return{
                msg:'hello vue'
            }
        },
        components:{
            'other-component':OtherComponent,
            HeaderComponent,
        },
        route: {
            data() {
                this.$http.get(this.aggregate.plural).then((response) => {
//                    console.log(response);
                    this.tableData = response.data;
                    if (this.tableData[0]) {
                        this.tableColumns = Object.keys(this.tableData[0]);
//                        console.log(this.tableColumns)
                    }
                }, (response) => {
                    // error callback
                });
            }
    }
</script>
