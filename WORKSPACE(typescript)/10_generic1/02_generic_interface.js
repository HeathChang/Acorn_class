var Car = /** @class */ (function () {
    function Car() {
    }
    Car.prototype.mesg = function (x) {
        return x;
    };
    return Car;
}());
////
var c = new Car();
var m = c.mesg("철수");
console.log(m);
var c2 = new Car();
var m2 = c2.mesg(new Date());
console.log(m2);
