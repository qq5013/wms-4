export default class FormElement {
    constructor(label, name, value = '') {
        this.label = label;
        this.elementName = name;
        this.value = value;
    }
}