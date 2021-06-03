//interface
interface Point{
  x:number
  y:number
}

//인터페이스를 사용하는 형태1: 객체 사용
var p: Point={
  x:10,
  y:20
}

console.log(p.x+"\t"+p.y);

//2.클래스 사용 
class XXX{
  x:number
  y:number;
  constructor (x,y){
    this.x =x;
    this.y=y;
  }
}

var k = new XXX(10,20);
console.log(k.x+"\t"+k.y);
var ppp:Point=k; //duck typing
console.log(ppp.x+"\t"+ppp.y);

///
function kkk(k:Point, k2:Point){
  console.log(k.x+"\t"+k.y);
  console.log(k2.x+"\t"+k2.y);
}
kkk({x:1,y:2}, {x:3,y:4});

////
class Bird{
  mesg:string
}

function myBird(a:Bird){
  console.log(a.mesg);
}

myBird({mesg:"aaa"});
var pppp={mesg:"bbb"}
myBird(pppp);
var ppp2:Bird = pppp as Bird;
console.log(ppp2.mesg);


