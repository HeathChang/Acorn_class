var StaticMem = /** @class */ (function () {
    function StaticMem() {
    }
    StaticMem.disp = function () {
        console.log("the value of num is " + StaticMem.num); //클래스이름으로 접근
    };
    return StaticMem;
}());
StaticMem.num = 12;
StaticMem.disp();
