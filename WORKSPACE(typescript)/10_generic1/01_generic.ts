class Box{//generic 사용 X
  obj:any;
  setValue(obj:any){
    this.obj=obj;
  }

  getValue(){
    return this.obj;
  }
}
//////
var a: Box= new Box();
a.setValue("홍길동");

var str:string=a.getValue() as string;
console.log(str);

var b:Box= new Box();
b.setValue(new Date());
var str2:Date=b.getValue() as Date;
console.log(str2);



