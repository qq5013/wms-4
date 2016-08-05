import Vue from 'vue'
import App from './components/App.vue'

Vue.filter('default', function (value, defaultValue) {
    if (!value) {
        return defaultValue;
    }

    return value;
});

new Vue({
    el: 'body',
    components: {
        App
    }
});