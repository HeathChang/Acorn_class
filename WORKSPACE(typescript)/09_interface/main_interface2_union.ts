//interface union 사용
interface IPerson{
  firstName:string;
  lastName:string;
  mesg:string|number|string[];
  sayHi:()=> string //리턴타입
}


var kkk:IPerson={
  firstName:"손오천",
  lastName:"트랭크스",
  sayHi:():string=> {return "퓨전~"}, //실제 객체를 IPerson타입에 맞도록 구현
  mesg:"오천크스~"
}
console.log(kkk.mesg);
/////////
var kkk2:IPerson={
  firstName:"손오천",
  lastName:"트랭크스",
  sayHi:():string=> {return "퓨전~"}, //실제 객체를 IPerson타입에 맞도록 구현
  mesg:["오천크스(성공)","오천크스(실패1)","오천크스(실패2)"]
}
console.log(kkk2.mesg);
/////////
var kkk3:IPerson={
  firstName:"20",
  lastName:"Hanks",
  sayHi:():string=>{return "Hi there"},
  mesg:["aaa","bbb", "ccc"] //string[]
}
console.log(kkk3.mesg);
