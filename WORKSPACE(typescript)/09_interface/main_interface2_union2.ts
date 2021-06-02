//interface union 사용
interface IPerson{
  firstName:string;
  lastName:string;
  mesg2:string|number|string[]|((x)=>string);
  //function(x) {return string}
  sayHi:()=> string //리턴타입
}

var kkk2:IPerson={
  firstName:"손오천",
  lastName:"트랭크스",
  sayHi:():string=> {return "퓨전~"}, 
  mesg2:(x)=>{return "성공~~~"+x}
}
var fn:any=kkk2.mesg2;
console.log(fn("오천크스!!"));

