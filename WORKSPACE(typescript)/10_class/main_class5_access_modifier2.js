var BBB = /** @class */ (function () {
    function BBB(x2) {
        this.x2 = x2;
        //객체 멤버변수가 추가 
        console.log(x2);
        this.str = x2;
    }
    BBB.prototype.info = function (x) {
        console.log(x);
    };
    return BBB;
}());
var x = new BBB(100);
console.log(x.x2); //100
console.log(x.str); //100
