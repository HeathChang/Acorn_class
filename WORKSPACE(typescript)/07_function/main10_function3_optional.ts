//1. optional param
//매개변수명 ? 추가, 맨 마지막 인자로 선언
function test_param(n1:number,s1:string,s2?:string) {
  console.log(n1)
  console.log(s1)
  console.log(s2)
}

test_param(123,"내 이름은 코난!");  //undefined: 원래는 불가인데 ?로 인해 쓰든 안쓰든 가능
test_param(123,"내 이름은 코난!","탐정이죠");

console.log("=============");
