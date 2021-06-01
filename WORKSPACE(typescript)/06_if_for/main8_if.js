//1.단일 if문
var num = 5;
if (num > 0) {
    console.log("number is positive");
}
//2.if-else
var num2 = 12;
if (num2 % 2 == 0) {
    console.log("Even");
}
else {
    console.log("odd");
}
//3. 다중 if문
var num3 = 2;
if (num3 > 0) {
    console.log(num3 + " is positive");
}
else if (num3 < 0) {
    console.log(num3 + " is negative");
}
else {
    console.log(num3 + " is neither p nor n");
}
//4.switch 문
var grade = "C";
switch (grade) {
    case "A":
        console.log("Excellent");
        break;
    case "B":
        console.log("Good");
        break;
    case "C":
        console.log("Fair");
        break;
    case "D":
        console.log("Poor");
        break;
    default:
        console.log("Invalid");
        break;
}
