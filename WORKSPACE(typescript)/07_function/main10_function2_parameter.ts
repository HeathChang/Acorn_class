//1.기본 call by value
function test_param(n1:number, s1:string) {
  n1=200; //n1변경
  console.log("블럭안에서: ",n1);
  console.log(s1);
}

var n1:number=10;
test_param(n1," this is a string"); 
//test_param(123); //인자의 갯수와 타입 모두 일치 必
console.log("함수호출후=== "+n1); //10
console.log("============");


//2.call by pointer
class Person{
  username:string;
  constructor(n){
    this.username=n;
  }
  setUsername(n){
    this.username=n;
  }
  getUsername(){
    return this.username;
  }
}

var p = new Person("홍길동");
function test_param2(pp:Person){ //매개변수 class타입
  pp.setUsername("이순신");
}
test_param2(p);
console.log(p.getUsername()); //이순신
console.log("============");

//3.call by pointer 배열
var str:string[]=['손오공','크리링','베지터']
function changeName(s:String[]) {
  s[0]="야무치";
}
console.log("변경전: ",str);
changeName(str);
console.log("변경후: ",str);
