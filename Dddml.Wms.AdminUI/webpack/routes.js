import Index from './components/Index.vue';
import AggregateRoot from './components/AggregateRoot.vue';
import Entity from './components/Entity.vue';
import CreateEntity from './components/CreateEntity.vue';

export default {
    '/': {
        name: 'index',
        component: Index
    },
    '/get/:name/': {
        name: 'entities',
        component: AggregateRoot
    },
    '/get/:name/:id/': {
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
    '/create/:name/': {
        name: 'createEntity',
        component: CreateEntity
    }
};