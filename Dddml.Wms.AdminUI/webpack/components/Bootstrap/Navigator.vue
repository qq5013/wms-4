<template>
    <ol class="breadcrumb">
        <li><a v-link="{name: 'index'}"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li v-for="item in navigator.items"><a v-link="item.route">{{item.label}}</a>
        </li>
    </ol>
</template>
<style>
</style>
<script>
    export default{
        data(){
            return {}
        },
        props: {
            navigator: {}
        }
    }
</script>
