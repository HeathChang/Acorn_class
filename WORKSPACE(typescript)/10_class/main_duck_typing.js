var Sparrow = /** @class */ (function () {
    function Sparrow() {
        this.sound = "참새 짹짹~";
    }
    return Sparrow;
}());
var Parrot = /** @class */ (function () {
    function Parrot() {
        this.sound = "앵무새 안녕~";
    }
    return Parrot;
}());
var Duck = /** @class */ (function () {
    function Duck() {
        this.sound = "오리 꽦꽦~";
    }
    Duck.prototype.swim = function () {
        console.log("오리가 헤엄치다");
    };
    return Duck;
}());
////
var parrot = new Sparrow();
console.log(parrot.sound);
var sparrow = new Parrot();
console.log(sparrow.sound);
var parrotTwo = new Duck();
console.log(parrotTwo.sound);
//var baby: Duck = new Parrot(); //에러: 두개짜리에 한개짜리 못넣어줌
