//1.for문
var num = 5;
var i;
var factorial = 1;
for (var i_1 = num; i_1 >= 1; i_1--) {
    factorial *= i_1;
}
console.log(factorial);
//2.while문
var num = 5;
var factorial = 1;
while (num >= 1) {
    factorial = factorial * num;
    num--;
}
console.log(factorial);
//3. do-while
var n = 10;
do {
    console.log(n);
    n--;
} while (n >= 0);
console.log("=============");
//4.for~in
var x = [1, 2, 3];
for (var x2 in x) {
    console.log(x2, x[x2]);
}
////
var xx = "abc";
for (var x2 in xx) {
    console.log(">>", xx[x2]);
}
////
var xxx = { k: 100, k2: 200, k3: 300 };
for (var x2 in xxx) {
    console.log(">>", x2, xxx[x2]);
}
console.log("=============");
//5.for~of
//반복할 수 있는 대상은 반드시 iterable 객체만 가능하고 실제값 반환.
//객체는 iterable 객체가 아니기 떄문에 사용불가
var y = "abc";
for (var _i = 0, y_1 = y; _i < y_1.length; _i++) {
    var y2 = y_1[_i];
    console.log(y2);
}
var yyy = { k: 100, k2: 200, k3: 300 };
for (var _a = 0, yyy_1 = yyy; _a < yyy_1.length; _a++) {
    var y3 = yyy_1[_a];
    console.log(y3);
}
