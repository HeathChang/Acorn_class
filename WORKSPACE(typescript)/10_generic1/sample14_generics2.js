var Box4 = /** @class */ (function () {
    function Box4() {
    }
    Box4.prototype.setValue = function (obj) {
        this.obj = obj;
    };
    Box4.prototype.getValue = function () {
        return this.obj;
    };
    return Box4;
}());
function aaa(p) {
    console.log(p.getValue());
}
var ppp = new Box4();
ppp.setValue("유리");
var ppp2 = new Box4();
ppp2.setValue(10);
aaa(ppp);
aaa(ppp2);
