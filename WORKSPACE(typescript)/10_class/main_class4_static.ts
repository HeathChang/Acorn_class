class StaticMem{
  static num:number;
  static disp():void{
    console.log("the value of num is "+StaticMem.num); //클래스이름으로 접근
    
  }
}

StaticMem.num=12;
StaticMem.disp();