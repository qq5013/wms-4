import FormElement from "./FormElement";

export default class Form {
    constructor(metadata, config) {
        this.formName = metadata.name;
        this.elements = [];
        this.displaiedElements = []
        this.config = config;

        //TODO 判断 config 中的 displayFields 中的键，是否是数据字段，不存在就忽略
    }

    addElement(element) {
        this.elements.push(element);
    }

    _addDisplayedElement(element) {
        this.displaiedElements.push(element);
    }

    getData() {
        let data = {};
        for (let i = 0; i < this.elements.length; i++) {
            data[this.elements[i].elementName] = this.elements[i].value;
        }

        return data;
    }

    toJson() {
        return JSON.stringify(this.getData());
    }

    static createForm(metadata, config) {
        let form = new Form(metadata, config);

        let idElement = new FormElement(
            metadata.id.name,
            metadata.id.name
        );

        form.addElement(idElement);
        form._addDisplayedElement(idElement);

        for (let i = 0; i < metadata.fields.length; i++) {
            let element = new FormElement(
                metadata.fields[i],
                metadata.fields[i]
            );

            form.addElement(element);

            if (form.config.displayFields[metadata.fields[i]]) {
                form._addDisplayedElement(element);
            }
        }

        return form;
    }
}