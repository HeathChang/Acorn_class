"use strict";
exports.__esModule = true;
var person_1 = require("./person");
var p = {
    name: "홍길동",
    age: 20,
    address: "서울"
};
console.log(p);
var p2 = p; //person타입으로 저장
//console.log(p2.getName(),p2.getAge(),p2.getAddress());
console.log(p2);
var p3 = {
    name: "강감찬",
    age: 20,
    address: "부산",
    getName: function () {
        return this.name;
    },
    getAge: function () {
        return this.age;
    },
    getAddress: function () {
        return this.address;
    }
};
console.log(p3.getName(), p3.getAge(), p3.getAddress());
//
var p4 = new person_1.Person("aa", 30, "bb");
console.log(p4.getName(), p4.getAge(), p4.getAddress());
