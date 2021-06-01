function greet():string {
  return "Hello World";
}

function caller() {
  var mesg=greet();
  console.log(mesg);
  
}

caller();