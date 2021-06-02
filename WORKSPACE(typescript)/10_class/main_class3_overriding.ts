class Employee{
  name:string;
  salary:number;
  constructor(name:string,salary:number){
    this.name=name;
    this.salary=salary;
  }
  getEmployee():string{
    return this.name+"\t"+this.salary;
  }
}

class Manager extends Employee{
  depart:string;
  constructor(name,salary,depart){
    super(name,salary)
    this.depart=depart;
  }
  getEmployee():string{ //오버라이딩
    return super.getEmployee+"\t"+this.depart;
  }
}
var man= new Manager("홍길동", 200, "인사");
console.log(man.getEmployee());
