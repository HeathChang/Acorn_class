var AgriLoan = /** @class */ (function () {
    function AgriLoan(interest, rebate) {
        this.interest = interest;
        this.rebate = rebate;
    }
    return AgriLoan;
}());
var obj00 = new AgriLoan(10, 1);
console.log("Interest is: " + obj00.interest + " ReBate is:  " + obj00.rebate);
console.log(typeof obj00, obj00 instanceof AgriLoan);
//
var obj2 = new AgriLoan(100, 2); //다형성
console.log(typeof obj2, obj2 instanceof AgriLoan);
//
var test = obj2; //형변환
console.log(test.rebate);
var test2 = obj2; //형변환
console.log(test2.rebate);
