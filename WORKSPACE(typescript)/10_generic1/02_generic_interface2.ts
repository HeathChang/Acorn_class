interface Product2<T>{
  mesg:(x:T)=> T //인자,리턴 타입 generic
}

class Car2<T> implements Product2<T>{
  mesg(x:T){return x} //함수 오버라이딩
}

var cc:Car2<string>= new Car2<string>();
var mm =cc.mesg("훈이");
console.log(mm);

var dd:Car2<Date>= new Car2<Date>();
var mm2 =dd.mesg(new Date());
console.log(mm2);

