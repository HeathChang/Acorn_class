class Sparrow{
  sound="참새 짹짹~";
}
class Parrot{
  sound="앵무새 안녕~";
}

class Duck{
  sound="오리 꽦꽦~";
  swim(){
    console.log("오리가 헤엄치다");
  }
}

////
var parrot:Parrot= new Sparrow();
console.log(parrot.sound);
var sparrow:Sparrow= new Parrot();
console.log(sparrow.sound);
var parrotTwo:Parrot= new Duck();
console.log(parrotTwo.sound);

//var baby: Duck = new Parrot(); //에러: 두개짜리에 한개짜리 못넣어줌