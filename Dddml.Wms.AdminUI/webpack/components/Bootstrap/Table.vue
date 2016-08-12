<template>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>{{tableData.id}}</th>
            <th v-for="column in tableData.columns">{{column}}</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="row in tableData.rows">
            <td>{{row[tableData.id]}}</td>
            <td v-for="column in tableData.columns">{{row[column]}}</td>
            <td>
                <a v-link="row.detailRoute" class="btn btn-sm bg-light-blue">查看</a>
                <a href="{{row.editLink}}" class="btn btn-sm bg-orange">编辑</a>
                <a href="{{row.delLink}}" class="btn btn-sm bg-red delete">删除</a>
            </td>
        </tr>
        </tbody>
    </table>
</template>
<style>
</style>
<script>
    export default{
        data(){
            return {}
        },
        props: {
            tableData: Object
        },
        components: {}
    }
</script>
