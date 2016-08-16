<template>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                {{metadata.label}}
            </h1>
            <navigator :navigator="$root.navigator"></navigator>
        </section>

        <section class="content">
            <v-form :form="form"></v-form>
        </section>
    </div>
</template>
<style>
</style>
<script>
    import VForm from './Bootstrap/Form.vue'
    import FormCls from '../src/Form/Form';
    import FormElementCls from '../src/Form/FormElement';
    import Navigator from './Bootstrap/Navigator.vue';

    export default{
        data(){
            return {
                form: new FormCls(this.metadata.plural)
            }
        },
        components: {
            VForm,
            Navigator
        },
        props: {
            metadata: Object
        },
        route: {
            data(){
                for (let i = 0; i < this.metadata.fields.length; i++) {
                    this.form.addElement(
                            new FormElementCls(
                                    this.metadata.fields[i],
                                    this.metadata.fields[i]
                            )
                    )
                }
//                console.log(this.form);
            }
        }
    }
</script>
