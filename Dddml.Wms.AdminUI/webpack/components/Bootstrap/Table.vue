<template>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th v-for="column in columns">{{column}}</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="row in rows">
            <td v-for="column in columns">{{row[column]}}</td>
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
    import ButtonDropdowns from './buttonDropdowns.vue'
    export default{
        data(){
            return {}
        },
        props: {
            columns: Array,
            rows: Array
        },
        components: {
            ButtonDropdowns
        }
    }
</script>
