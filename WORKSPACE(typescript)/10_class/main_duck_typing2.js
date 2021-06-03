//인터페이스를 사용하는 형태1: 객체 사용
var p = {
    x: 10,
    y: 20
};
console.log(p.x + "\t" + p.y);
//2.클래스 사용 
var XXX = /** @class */ (function () {
    function XXX(x, y) {
        this.x = x;
        this.y = y;
    }
    return XXX;
}());
var k = new XXX(10, 20);
console.log(k.x + "\t" + k.y);
var ppp = k; //duck typing
console.log(ppp.x + "\t" + ppp.y);
///
function kkk(k, k2) {
    console.log(k.x + "\t" + k.y);
    console.log(k2.x + "\t" + k2.y);
}
kkk({ x: 1, y: 2 }, { x: 3, y: 4 });
////
var Bird = /** @class */ (function () {
    function Bird() {
    }
    return Bird;
}());
function myBird(a) {
    console.log(a.mesg);
}
myBird({ mesg: "aaa" });
var pppp = { mesg: "bbb" };
myBird(pppp);
var ppp2 = pppp;
console.log(ppp2.mesg);
