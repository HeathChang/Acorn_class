//1.함수의 제네릭 
function six<T>(n:T):T{
  return n;
}

var aa=six<number>(100);
var bb= six<string>("aaa");
var cc= six<boolean>(true);
console.log(aa,bb,cc);

//2.배열의 제네릭 
function six2<T>(n:T[]):number{
  return n.length;
}

var aa2=six2<number>([1,2]);
var bb2= six2<string>(["aa","bb","cc"]);
var cc2= six2<boolean>([true,false]);
console.log(aa2,bb2,cc2);

function six3<T>(n:T[]):string{
  return n.length+"";
}
var aa3=six3<number>([1,2]);
var bb3= six3<string>(["aa","bb","cc"]);
var cc3= six3<boolean>([true,false]);
console.log(aa2,bb2,cc2);
