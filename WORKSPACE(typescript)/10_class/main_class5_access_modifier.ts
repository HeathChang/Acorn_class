class Encapsulate{
  str:string="hello";
  private str2:string="World" //전급 제한자
}

var obj0=new Encapsulate();
console.log(obj0.str);
//console.log(obj0.str2);//접근 불가

//상속
class A{
  public a: Number=10;
  private b: Number=20;
  protected c: Number=30;
}

class B extends A{
  info(){
    console.log(this.a);
    //console.log(this.b);//접근불가
    console.log(this.c);
  }
}

var aa = new B();
aa.info();

