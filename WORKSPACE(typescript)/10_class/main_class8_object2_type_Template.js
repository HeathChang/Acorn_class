var person = {
    firstname: "신",
    lastname: "짱구",
    sayEcho: function () { },
    email: ""
};
person.sayEcho = function () { console.log("부리부리부리"); };
person.email = "aa@daum.net";
console.log(person.firstname, person.lastname, person.sayEcho(), person.email);
person.sayEcho();
