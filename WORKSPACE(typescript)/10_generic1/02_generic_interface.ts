interface Product{
  mesg:(x:any)=> any; //리턴 타입
}
class Car implements Product{
  mesg(x:any){
    return x;
  }
}

////
var c= new Car();
var m = c.mesg("철수");
console.log(m);

var c2= new Car();
var m2 = c2.mesg(new Date());
console.log(m2);
