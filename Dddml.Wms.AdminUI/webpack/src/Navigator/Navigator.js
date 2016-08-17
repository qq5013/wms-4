import NavItem from './NavigatorItem'

export default class Navigator {
    constructor(metadata) {
        this.items = [];
        this.metadata = metadata;
        this.aggregateMeta = {};
    }

    build(route) {
        let metadata = this.getAggregateMetadata(route.params.name);
        this.reset();

        this.addItem(
            new NavItem(metadata.collectionLabel, {
                name: 'entities',
                params: {
                    name: route.params.name
                }
            })
        );

        if (route.name == 'entity') {
            this.addItem(
                new NavItem(metadata.label, {
                    name: 'entity',
                    params: {
                        name: route.params.name,
                        id: route.params.id
                    }
                })
            );
        }

        if (route.name == 'createEntity') {
            this.addItem(
                new NavItem('创建 ' + metadata.label, {
                    name: 'createEntity',
                    params: {
                        name: route.params.name
                    }
                })
            );
        }
    }

    getAggregateMetadata(name) {
        if (!this.aggregateMeta[name]) {
            this.aggregateMeta[name] = this.metadata.getAggregateByPlural(
                name
            );
        }

        return this.aggregateMeta[name];
    }

    addItem(item) {
        this.items.push(item);
    }

    reset() {
        this.items = [];
    }
}