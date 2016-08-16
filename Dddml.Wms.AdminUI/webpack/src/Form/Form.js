export default class Form {
    constructor(name) {
        this.formName = name;
        this.elements = [];
    }

    addElement(element) {
        this.elements.push(element);
    }
}