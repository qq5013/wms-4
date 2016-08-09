import Vue from 'vue'
import App from './components/App.vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import route from './routes'

Vue.filter('default', function (value, defaultValue) {
    if (!value) {
        return defaultValue;
    }

    return value;
});

Vue.use(VueResource);
Vue.http.options.root = '/api';

Vue.use(VueRouter);
var router = new VueRouter();

router.map(route);

router.start(App, '#app');