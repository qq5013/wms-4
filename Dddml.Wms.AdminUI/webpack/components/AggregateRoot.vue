<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                {{aggregate.title}}
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 聚合</a></li>
                <li class="active">{{aggregate.title}}</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">{{aggregate.title}}</h3>
                </div>
                <div class="box-body no-padding table-responsive">
                    <v-table :columns="tableColumns" :rows="tableData"></v-table>
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    脚部
                </div>
                <!-- /.box-footer-->
            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->
    </div>
</template>
<style>
</style>
<script>
    import VTable from './Bootstrap/Table.vue'
    export default{
        data(){
            return {
                tableData: [],
                tableColumns: []
            }
        },
        components: {
            VTable
        },
        props: {
            aggregate: Object
        },
        route: {
            data() {
                this.$http.get(this.aggregate.plural).then((response) => {
                    this.tableData = response.data;
                    if (this.tableData[0]) {
//                        this.tableColumns = Object.keys(this.tableData[0]);
                        for(let key in this.tableData[0]){
                            if(!(this.tableData[0][key] instanceof Array)){
                                this.tableColumns.push(key);
                            }
                        }
                    }
                    for (let i = 0; i < this.tableData.length; i++) {
                        let id;
                        if ((typeof this.aggregate.id) == 'string') {
                            id = this.tableData[i][this.aggregate.id];
                        } else {
                            let properties = [];
                            for (let j = 0; j < this.aggregate.id.properties.length; j++) {
                                properties.push(this.tableData[i][this.aggregate.id.name][this.aggregate.id.properties[j]]);
                            }
                            id = properties.join(',');
                        }

                        this.tableData[i].detailRoute = {
                            name: 'entity',
                            params: {
                                name: this.aggregate.plural,
                                id: encodeURI(id)
                            }
                        };
                    }
                }, (response) => {
                    // error callback
                });

            }
        },
    };
</script>
