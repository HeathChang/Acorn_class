var Box2 = /** @class */ (function () {
    function Box2() {
    }
    Box2.prototype.setValue = function (obj) {
        this.obj = obj;
    };
    Box2.prototype.getValue = function () {
        return this.obj;
    };
    return Box2;
}());
//
var x = new Box2();
x.setValue("봉미선");
var xx = x.getValue();
console.log(xx);
var y = new Box2();
y.setValue(new Date());
var yy = y.getValue();
