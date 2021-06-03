function info4(str:{readonly username:string, age?:number}){
  console.log(str.username+"\t"+str.age);
}

info({username:"신형만",age:35});
info4({username:"신형만 로봇"});