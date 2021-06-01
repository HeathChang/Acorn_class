var global_num=10;

class Numbers{
  num_val=20;
  static s_val=30;

  xxx():void{
    var local_num=40; //var 사용, 함수에서 사용하는 로칼변수
    console.log(global_num,Numbers.s_val); //전역 & static 변수
    console.log(local_num); //전역 & static 변수
  }
}

console.log(global_num); //전역변수
console.log(Numbers.s_val); //클래스,static 변수

var n=new Numbers();
var result = n.num_val;
console.log(result);
n.xxx();