import Index from './components/Index.vue';
import AggregateRoot from './components/AggregateRoot.vue';
import Entity from './components/Entity.vue';
export default {
    '/': {
        name: 'index',
        component: Index
    },
    '/:name/': {
        name: 'entities',
        component: AggregateRoot
    },
    '/:name/:id/': {
        name: 'entity',
        component: Entity
    },
    // '/:name/:id/:embedEntities': {
    //     name: 'embedEntities',
    //     component: Entity
    // },
    // '/:name/:id/:embed/:eid': {
    //     name: 'embedEntity',
    //     component: Entity
    // },
};