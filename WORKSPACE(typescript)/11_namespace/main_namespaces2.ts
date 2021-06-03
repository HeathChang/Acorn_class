namespace MyNamespace{
  export interface IPerson{
    username:string;
    age:number;
  }
}

var kkk:MyNamespace.IPerson={
  username:"맹구",
  age:5
}
console.log(kkk.username, kkk.age);
/////////////
namespace MyNameSpace2{
  export interface IPerson{
    email:string;
    phone:number;
  }
}
var kkk2:MyNameSpace2.IPerson={
  email:"맹구@맹구닷컴",
  phone:112
}

console.log(kkk2.email, kkk2.phone);
