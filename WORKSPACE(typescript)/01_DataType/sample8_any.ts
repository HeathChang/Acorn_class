//any타입
//무엇이든 할당 가능하나, 동적타입이므로, 툴에서 제공하는 intellisense 지원을 못받고 정적 타입검사 못함.
var power:any;
power="123";
power=123;

var num:number;
num=power;

var mmm:string="hello";
var mmm2:any="hello";
console.log(mmm);
console.log(mmm2);