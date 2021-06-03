abstract class Animal{
  abstract makeSound():void; //추상 메소드 선언
  move():void{
    console.log("Animal Move");
  }
}

class Cat extends Animal{
  makeSound():void{
    console.log("makeSound");
  }
}

var c = new Cat();
c.makeSound();
c.move();