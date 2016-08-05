<template>
    <div class="btn-group">
        <button type="button"
                class="btn {{btnType}} dropdown-toggle"
                data-toggle="dropdown"
                aria-haspopup="true"
                aria-expanded="false">
            {{text}}<span class="caret"></span>
        </button>
        <ul class="dropdown-menu">
            <li v-for="link in links">
                <a href="{{link.href}}" target="{{link.target | default '_self'}}">{{link.text}}</a>
            </li>
        </ul>
    </div>
</template>
<style>
</style>
<script>
    export default{
        data(){
            return {}
        },
        props: {
            text: String,
            btnType: String,
            links: Array
        }
    }
</script>
