class BBB{
  str:number;
  info(x:number){
      console.log(x);
  }
  constructor(public x2:number){//접근 지정자는 생성자에서 사용
      //객체 멤버변수가 추가 
      console.log(x2);
      this.str= x2;
  }
}
var x= new BBB(100);
console.log(x.x2);//100
console.log(x.str);//100
