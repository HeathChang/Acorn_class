//1.함수의 제네릭 
function six(n) {
    return n;
}
var aa = six(100);
var bb = six("aaa");
var cc = six(true);
console.log(aa, bb, cc);
//2.배열의 제네릭 
function six2(n) {
    return n.length;
}
var aa2 = six2([1, 2]);
var bb2 = six2(["aa", "bb", "cc"]);
var cc2 = six2([true, false]);
console.log(aa2, bb2, cc2);
function six3(n) {
    return n.length + "";
}
var aa3 = six3([1, 2]);
var bb3 = six3(["aa", "bb", "cc"]);
var cc3 = six3([true, false]);
console.log(aa2, bb2, cc2);
