//type assertion number=> string:현재타입 -> any-> 목적타입으로 변환
var str=1;
var str4:string=((str as any)as string);
console.log(str4);

//현재타입 -> any-> 목적타입
var str1="1";
var str2:number=<number><any>str1; //string->any-> number
var str3:string=<string><any>str2;
console.log(str1,str2,str3);