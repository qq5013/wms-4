export default class Table {
    constructor(id, columns, rows) {
        this.id = id ? id : "";
        this.columns = columns ? columns : [];
        this.rows = rows ? rows : [];
        this.routes = []
    }
}