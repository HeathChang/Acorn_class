//interface 필요한 이유.
//1. size속성이 필요하지만 문제없이 실행된다
function xyz(p:{label:string}) {
  console.log(p.label);
}
var m0={size:10,label:"포포"};
xyz(m0); //실행 가능, 보다 엄격한 타입 검사가 필요함

interface ppp{
  size:number,
  label:string
};

function xyz2(p:ppp) {
  console.log(p.size,"\t",p.label);
}

var m1={size:10,label:"프리저"};
xyz2(m1);
var m2={label:"인조인간 16호"};
//xyz2(m2);//에러