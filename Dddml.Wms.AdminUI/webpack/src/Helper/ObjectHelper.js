export default class ObjectHelper {
    static isEmpty(obj) {
        for (var key in obj) {
            return false;
        }
        return true;
    }

    static isNotEmpty(obj) {
        return !ObjectHelper.isEmpty(obj);
    }
}