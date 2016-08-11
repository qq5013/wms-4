import Index from './components/Index.vue';
import AggregateRoot from './components/AggregateRoot.vue';
import Entity from './components/Entity.vue';
export default {
    '/': {
        component: Index
    },
    '/:name/': {
        name: 'aggregate',
        component: AggregateRoot
    },
    '/:name/:id/': {
        name: 'entity',
        component: Entity
    }
};