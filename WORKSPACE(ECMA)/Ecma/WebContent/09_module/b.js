//export해서 a.js에서 사용함. default가 아닌경우 {person ,bbb} {}사용 import 해야댐


export class Person{
	constructor(n){
		this.name=n;
	}
}

export function bbb(){
	console.log("bbb hello");
}