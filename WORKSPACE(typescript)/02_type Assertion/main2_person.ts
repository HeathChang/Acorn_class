import { Person } from "./person";

var p={
  name:"홍길동",
  age:20,
  address:"서울"
};

console.log(p);
var p2= p as Person; //person타입으로 저장
//console.log(p2.getName(),p2.getAge(),p2.getAddress());
console.log(p2);

var p3:Person={
  name:"강감찬",
  age:20,
  address:"부산",
  getName(){
    return this.name;
  },
  getAge(){
    return this.age;
  },
  getAddress(){
    return this.address;
  }
}
console.log(p3.getName(),p3.getAge(),p3.getAddress());
//
var p4:Person=new Person("aa",30,"bb");
console.log(p4.getName(),p4.getAge(),p4.getAddress());
