<template>
    <form role="form" class="form-horizontal">
        <!-- Default box -->
        <div class="box">
            <div class="box-body">
                <template v-for="element in form.elements">
                    <form-element :element.sync="element"></form-element>
                </template>
            </div>
            <div class="box-footer">
                <div class="form-group">
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-10">
                        <button v-on:click="submit" type="button" class="btn bg-orange">
                            <i class="fa fa-fw fa-check"></i> 确定
                        </button>
                    </div>
                </div>

            </div>
            <!-- /.box-footer-->
        </div>
        <!-- /.box -->
    </form>
</template>
<style>
</style>
<script>
    import FormElement from './FormElement.vue';
    import ObjectHelper from '../../src/Helper/ObjectHelper';

    export default{
        data(){
            return {}
        },
        components: {
            FormElement
        },
        props: {
            form: Object
        },
        methods: {
            submit: function () {
                    this.$dispatch('submit', this.form);
            }
        }
    }
</script>
