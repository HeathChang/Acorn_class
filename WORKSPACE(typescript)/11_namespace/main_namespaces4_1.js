/// <reference path="./main_namespaces4.ts" />
//외부 main_namespaces4.ts namespace참조   주의 /// <reference/>
//main_namespaces4.ts파일에 있는 IPerson 인터페이스 참조
var Person = /** @class */ (function () {
    function Person(u, a, e) {
        this.username = u;
        this.age = a;
        this.email = e;
    }
    Person.prototype.getInfo = function () {
        return this.username + "\t" + this.age + "\t" + this.email;
    };
    return Person;
}());
var xxx = new Person("홍길동", 20, "aa@daum.net");
console.log(xxx.getInfo());
