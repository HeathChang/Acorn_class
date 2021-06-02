interface Iparent1{
  v1:number;
}
interface Iparent2{
  v2:number;
}

interface Child extends Iparent1,Iparent2{

}

var Iobj:Child={v1:100,v2:200}
console.log(Iobj.v1,"\t",Iobj.v2);

