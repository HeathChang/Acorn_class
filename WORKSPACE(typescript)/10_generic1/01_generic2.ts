class Box2<T>{//generic 사용 X
  obj:T;
  setValue(obj:T){
    this.obj=obj;
  }

  getValue():T{
    return this.obj;
  }
}
//
var x: Box2<string> = new Box2<string>();
x.setValue("봉미선");
var xx:string=x.getValue();
console.log(xx);
var y:Box2<Date>= new Box2<Date>();
y.setValue(new Date());
var yy:Date= y.getValue();
console.log(yy);
