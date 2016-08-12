export default class Aggregate {
    constructor(data, metadata) {
        this.data = data;
        this.metadata = metadata;
    }

    getStringId(encode = true) {
        let id;
        let idName = this.metadata.id.name;

        if (this.metadata.id.properties) {
            let properties = [];

            for (let i = 0; i < this.metadata.id.properties.length; i++) {
                let propertyName = this.metadata.id.properties[i];

                properties.push(this.data[idName][propertyName]);
            }
            id = properties.join(',');
        } else {
            id = this.data[idName];
        }

        return encode ? encodeURI(id) : id;
    }
}