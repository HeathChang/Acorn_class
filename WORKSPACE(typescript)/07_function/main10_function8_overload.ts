//1.함수 선언: 오버로딩함수의 매개변수에 맞게 {} 없음 
function disp(n:number):void;
function disp(n:number, s:string):void;
function disp(n:number,  s:string, n2:number):void;


//2. 함수 정의: 함수 작성, optional parameter ? 사용
function disp(n:Number,s?:string,n2?:number): void{
  console.log(n,s,n2);
}

//3. 함수 호출
disp(100);
disp(100,"aa");
disp(100,"hello",200);
//////////
function xxx(n:number):void;
function xxx(n:string):void;
function xxx(n:any):void{
  console.log(n);
}
xxx(10);
xxx("20");
/////////
//1.함수의 선언
function disp2(n:number):void;
function disp2(s:string):void;
function disp2(s:string,n:number):void;
function disp2(n:number,s:string):void;

//2. 함수의 정의 
function disp2(n:any,s?:any):void{
  console.log(n,s);
}
//3. 함수의 호출
disp2(100);
disp2("손오공");
disp2(2,"천진반");
disp2("피콜로",3);

