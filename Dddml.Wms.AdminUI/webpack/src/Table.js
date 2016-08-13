export default class Table {
    constructor(id = "", columns = [], rows = []) {
        this.id = id;
        this.columns = columns;
        this.rows = rows;
        this.routes = []
    }
}