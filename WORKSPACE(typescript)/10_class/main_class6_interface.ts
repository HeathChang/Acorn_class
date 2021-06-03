interface ILoan{
  interest:number;
}

class AgriLoan implements ILoan{
  interest:number;
  rebate:number;
  constructor(interest:number,rebate:number){
    this.interest=interest;
    this.rebate=rebate;
  }
}

var obj00= new AgriLoan(10,1);
console.log("Interest is: "+ obj00.interest +" ReBate is:  "+obj00.rebate);
console.log(typeof obj00, obj00 instanceof AgriLoan);
//
var obj2:ILoan= new AgriLoan(100,2);//다형성
console.log(typeof obj2, obj2 instanceof AgriLoan);
//
var test=<AgriLoan>obj2;//형변환
console.log(test.rebate);
var test2=obj2 as AgriLoan //형변환
console.log(test2.rebate);
