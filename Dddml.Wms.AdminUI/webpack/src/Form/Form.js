export default class Form {
    constructor(name) {
        this.formName = name;
        this.elements = [];
    }

    addElement(element) {
        this.elements.push(element);
    }

    getData(){
        let data = {};
        for(let i=0; i< this.elements.length; i++){
            data[this.elements[i].elementName] = this.elements[i].value;
        }

        return data;
    }

    toJson(){
        return JSON.stringify(this.getData());
    }
}