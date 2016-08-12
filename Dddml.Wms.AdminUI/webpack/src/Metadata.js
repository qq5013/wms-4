export default class Metadata {
    constructor(data) {
        this.data = data;
    }

    getAggregateByPlural(value) {
        for (let i = 0; i < this.data.length; i++) {
            if (this.data[i].plural == value) {
                return this.data[i];
            }
        }
    }
}