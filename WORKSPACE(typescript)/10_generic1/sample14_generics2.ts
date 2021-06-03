class Box4<T>{//class generic
  obj;
  setValue(obj:T):void{
    this.obj=obj;
  }

  getValue():T{
    return this.obj;
  }
}
function aaa<T>(p:T){//함수에 generic
  console.log((<Box4<string>><any>p).getValue());
}
var ppp:Box4<string>=new Box4<string>();
ppp.setValue("유리");

var ppp2:Box4<number>=new Box4<number>();
ppp2.setValue(10);

aaa(ppp)
aaa(ppp2)
