enum Color {Red,Green,Blue};
let c: Color=Color.Red;
console.log(Color.Red);//0

//초기값 설정
enum Color2{Red=1, Green, BLue};
let c2: Color2=Color2.Green;
console.log(c2);//2

//명시적 값설정
enum Color3{Red=1, Green=3, BLue=4};
let c3: Color3=Color3.Green;
console.log(c3);//3
