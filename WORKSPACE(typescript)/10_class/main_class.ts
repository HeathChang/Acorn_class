class Greeter{
  greeting:string;
  
  constructor(message:string){
    this.greeting=message;
  }
  greet():string{
    return "Hello, "+this.greeting;
  }
}

///
let greeter = new Greeter("World");
console.log(greeter.greet());
greeter.greeting="aa";
console.log(greeter.greet());

