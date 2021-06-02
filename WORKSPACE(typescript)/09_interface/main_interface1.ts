interface IPerson{
  firstName:string;
  lastName:string;
  sayHi:()=> string //리턴타입
}

var customer:IPerson={
    firstName:"손오천",
    lastName:"트랭크스",
    sayHi:():string=> {return "퓨전~"} //실제 객체를 IPerson타입에 맞도록 구현
}
console.log("Customer Object");
console.log(customer.firstName);
console.log(customer.lastName);
console.log(customer.sayHi());

var employee:IPerson={
  firstName:"JIM",
  lastName:"Blakes",
  sayHi:():string=>"Hello"
}
console.log("Employee Object");
console.log(employee.firstName);
console.log(employee.lastName);
console.log(employee.sayHi());



