<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                {{metadata.collectionLabel}}
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 聚合</a></li>
                <li class="active">{{metadata.collectionLabel}}</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">{{metadata.collectionLabel}}</h3>
                </div>
                <div class="box-body no-padding table-responsive">
                    <v-table :table-data="table"></v-table>
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
    import VTable from './Bootstrap/Table.vue';
    import Table from '../src/Table';
    import Aggregate from '../src/Aggregate';
    import AggregateCollection from '../src/AggregateCollection';

    export default{
        data(){
            return {
                table: new Table()
            }
        },
        components: {
            VTable
        },
        props: {
            metadata: Object
        },
        route: {
            data() {
                this.$http.get(this.metadata.plural).then((response) => {
                    let aggregateCollection = new AggregateCollection(
                            response.data,
                            this.metadata
                    );

                    this.table = aggregateCollection.toTable();
                }, (response) => {
                    // error callback
                });

            }
        }
    };
</script>
