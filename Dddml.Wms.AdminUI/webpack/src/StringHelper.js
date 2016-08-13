export default class StringHelper {
    static lcfirst(str) {
        return str.replace(/\b\w+\b/g, function (word) {
            return word.substring(0, 1).toLowerCase() + word.substring(1);
        });
    }
}