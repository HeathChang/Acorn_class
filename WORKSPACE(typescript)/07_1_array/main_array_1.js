//배열의 사용
//1. 배열선언
var num;
//2. 배열 초기화
num = [10, 20, 30];
//3.출력
console.log(num[0], num[1]);
for (var key in num) {
    console.log(num[key]);
}
for (var x in num) {
    console.log(x, num[x]);
}
