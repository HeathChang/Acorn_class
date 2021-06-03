var Car2 = /** @class */ (function () {
    function Car2() {
    }
    Car2.prototype.mesg = function (x) { return x; }; //함수 오버라이딩
    return Car2;
}());
var cc = new Car2();
var mm = cc.mesg("훈이");
console.log(mm);
var dd = new Car2();
var mm2 = dd.mesg(new Date());
console.log(mm2);
