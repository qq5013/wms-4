<template>
    <table class="table table-bordered" v-on:click="output">
        <thead>
        <tr>
            <th v-for="column in columns">{{column}}</th>
            <th>操作</th>
            <th>实体</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="row in rows">
            <td v-for="field in row">{{field}}</td>
            <td>
                <a href="{{row.showLink}}" class="btn btn-sm bg-light-blue" target="_blank">查看</a>
                <a href="{{row.editLink}}" class="btn btn-sm bg-orange">编辑</a>
                <a href="{{row.delLink}}" class="btn btn-sm bg-red delete">删除</a>
            </td>
            <td>
                <button-dropdowns
                        text="选择"
                        btn-type="btn-primary"
                        :links="row.children.links">
                </button-dropdowns>
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
        },
        methods: {
            output(){
                console.log(this.rows);
            }
        }
    }
</script>
