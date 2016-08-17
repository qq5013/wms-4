export default class ObjectHelper {
    static isEmpty(obj) {
        for (var key in obj) {
            return false;
        }
        return true;
    }
}