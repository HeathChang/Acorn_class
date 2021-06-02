class Shape{
  area:number;
  constructor(a:number){
    this.area=a;
}

}

class Circle extends Shape{
  //기본 생성자 -> 부모 생성자 자동 호출
  disp(): void{
    console.log("area of the circle: "+this.area)
  }
}

var obj= new Circle(223);
obj.disp();