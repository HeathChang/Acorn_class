
//컴파일러에게 사용자가 타입을 정해주고, 컴파일에게 추측해서는 안된다고 알려줌
interface User{
  bar:number,
  baz:string;
} 
var user={};
//1. 빈 objeect 생성후 값 설정. 
var u:User={} as User;
u.bar=100;
u.baz="홍길동";
console.log(u);
//2. 변수에 직접 object할당
var u2:User={
  bar:10,
  baz:"b"
}
console.log(u2);