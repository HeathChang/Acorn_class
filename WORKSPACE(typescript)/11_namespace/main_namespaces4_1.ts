/// <reference path="./main_namespaces4.ts" />
//외부 main_namespaces4.ts namespace참조   주의 /// <reference/>

//main_namespaces4.ts파일에 있는 IPerson 인터페이스 참조
class Person implements FirstNamespace.IPerson{
  username:string;  //기재
  age:number;    //기재 
  email:string;
  constructor(u:string, a:number, e:string){
      this.username=u;
      this.age=a;
      this.email=e;
  }
  getInfo(){
      return this.username+"\t"+this.age+"\t"+this.email;
  }
}
var xxx= new Person("홍길동", 20, "aa@daum.net");

console.log(xxx.getInfo());
