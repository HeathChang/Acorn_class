var person = {
    firstname: "미스터",
    lastname: "사탄",
    sayEcho: function () {
        console.log("내가 세계 챔피언 !!");
    },
    phones: ["010", "02"]
};
console.log(person.firstname);
console.log(person.lastname);
person.sayEcho();
console.log(person.phones[0], person.phones[1]);
