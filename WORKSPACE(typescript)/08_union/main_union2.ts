//function 리턴 타입 union
function aaa999(n:any):string|number{
  return n;
}

var _x:string|number=aaa999("비비디");
var _x2:string|number=aaa999("비데츠");
console.log(_x,_x2);
