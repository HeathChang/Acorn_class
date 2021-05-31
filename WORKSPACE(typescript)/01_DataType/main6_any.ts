//any타입은 모든 타입을 담을수 있으므로, 필요한 경우 형변환 함
let someValue:any="this is a String";
let strLength:number=(<string>someValue).length //형변환
console.log(strLength);