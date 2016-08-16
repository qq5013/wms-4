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

        if (route.params.id) {
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