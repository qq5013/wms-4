import Index from './components/Index.vue';
import AggregateRoot from './components/AggregateRoot.vue';
export default {
    '/': {
        component: Index
    },
    '/aggregate/:name/': {
        name: 'aggregate',
        component: AggregateRoot
    }
};