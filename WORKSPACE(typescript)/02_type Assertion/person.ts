export class Person{
  constructor(public name:string,
  public age:number,
  public address:string){ //생성자 매개변수 public:멤버변수로 사용, 할당
    console.log("생성자 호출");
  } 
  getName(){
    return this.name;
  }
  getAge(){
    return this.age;
  }
  getAddress(){
    return this.address;
  }

  

}