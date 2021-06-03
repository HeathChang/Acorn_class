namespace MyNamespace{
  export interface IPerson{
    username:string;
    age:number;
  }
  export class Math{
    eng:number;
    kor:number;

    constructor(eng:number, kor:number){
      this.eng=eng;
      this.kor=kor
    }
    getInfo(){
      return this.eng + this.kor;
    }
  }

    export var user={
    name:"이순신",
    age:33
    }
} //end namespace

var kkk:MyNamespace.IPerson={
  username:"맹구",
  age:10
}

console.log(kkk.username+kkk.age);
var m0 = new MyNamespace.Math(100,200);
console.log(m0.eng+m0.kor);
console.log(MyNamespace.user.name+MyNamespace.user.age);


