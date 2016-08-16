<template>
    <div class="form-group">
        <label class="col-sm-2 control-label">{{element.label}}</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="{{element.elementName}}" id="{{element.elementName}}">
        </div>
    </div>
</template>
<style>
</style>
<script>
    export default{
        data(){
            return {}
        },
        components: {},
        props: {
            element: Object
        }
    }
</script>
