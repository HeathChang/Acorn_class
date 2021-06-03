var person={
  firstname:"신",
  lastname:"짱구",
  sayEcho:function(){},      //type template
  email:""  //type template
}

person.sayEcho=function(){console.log("부리부리부리");};
person.email="aa@daum.net";
//person.address="aaaa"; // 속성이 없어서 안됨.

console.log(person.firstname, person.lastname, person.sayEcho(),person.email);
person.sayEcho();