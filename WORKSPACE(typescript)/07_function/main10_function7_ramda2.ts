//1.함수 표현식 이용
var a = function(x:number){
  console.log("a: "+x);
  
}

a(10);

//2.람다 표현식
var a2=(x:number)=>console.log("a2: "+x);
a2(10);

//파라미터 한개면 () 생략 가능// 여러개인 경우 생략 불가
var a3=x=>console.log("a3: "+x);
a3(10);

console.log("=============");
var k = function(x:number,y:number){
  console.log("a: "+x+"\t"+"b: "+y);
}
k(10,20);
 // 
var k3 = function(x:number,y:number):void{ //return void
  console.log("a: "+x+"\t"+"b: "+y);
  //return x+y
}
k3(10,20);
//
var k4 = (x:number,y:number):string=>{ //return string
  console.log("a: "+x+"\t"+"b: "+y);
  return x+":"+y;
}
k3(10,20);
//

//파라미터가 여러개인 경우 ()생략불가
var k6= (x:number, y:number)=>{
     console.log("k6: "+"a: "+x+"\t"+"b: "+y);
    return {first:x, last:y};//object리턴 
}

var result= k6(10, 20);
console.log(result.first,  " ", result.last);



