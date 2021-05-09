var student2={
  username:"홍길동",
  age:20
}

function info(str) {
  console.log(str.username+"\t"+str.age)
}

//

function info2(str:{username:string, age:number}) {
  console.log(str.username+"\t"+str.age)
}

info(student2);
info2(student2);
