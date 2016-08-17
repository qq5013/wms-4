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
    import Navigator from './Bootstrap/Navigator.vue';

    export default{
        data(){
            return {
                form: FormCls.createForm(this.metadata)
            }
        },
        components: {
            VForm,
            Navigator
        },
        props: {
            metadata: Object
        },
        events: {
            submit(form){
                let json = form.toJson();
                console.log(json);
            }
        },
        route: {
            data(){
                this.$root.navigator.build(this.$route);
            }
        }
    }
</script>
