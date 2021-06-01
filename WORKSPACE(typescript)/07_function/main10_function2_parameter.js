//1.기본 call by value
function test_param(n1, s1) {
    n1 = 200; //n1변경
    console.log("블럭안에서: ", n1);
    console.log(s1);
}
var n1 = 10;
test_param(n1, " this is a string");
//test_param(123); //인자의 갯수와 타입 모두 일치 必
console.log("함수호출후=== " + n1); //10
console.log("============");
//2.call by pointer
var Person = /** @class */ (function () {
    function Person(n) {
        this.username = n;
    }
    Person.prototype.setUsername = function (n) {
        this.username = n;
    };
    Person.prototype.getUsername = function () {
        return this.username;
    };
    return Person;
}());
var p = new Person("홍길동");
function test_param2(pp) {
    pp.setUsername("이순신");
}
test_param2(p);
console.log(p.getUsername()); //이순신
console.log("============");
//3.call by pointer 배열
var str = ['손오공', '크리링', '베지터'];
function changeName(s) {
    s[0] = "야무치";
}
console.log("변경전: ", str);
changeName(str);
console.log("변경후: ", str);
