import FormElement from "./FormElement";

export default class Form {
    constructor(metadata) {
        this.formName = metadata.plural;
        this.elements = [];
    }

    addElement(element) {
        this.elements.push(element);
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

    static createForm(metadata) {
        let form = new Form(metadata);

        form.addElement(
            new FormElement(
                metadata.id.name,
                metadata.id.name
            )
        );

        for (let i = 0; i < metadata.fields.length; i++) {
            form.addElement(
                new FormElement(
                    metadata.fields[i],
                    metadata.fields[i]
                )
            )
        }

        return form;
    }
}