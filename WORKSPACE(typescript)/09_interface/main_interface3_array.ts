interface namelist{
  [index:number]:string;//배열이 사용하는 키의 종류와 그 배열에 들어있는 항목의 탑을 모두 정의
   //키의 타입을 설정하기 위해서는 [index:타입] 형식을 이용한다. 
   //key: number , 데이터 string
};

}

var list:namelist=["aaa","bbb","ccc"];
list[3]="ddd";
console.log(list);


interface namelist2{
  [index:number]:number
}

var list2=[1,2,3];
list2[3]=100;
console.log(list2);
///

interface age{
  [index:string]:number
}

var agelist:age={};
agelist["one"]=100;
agelist["two"]=200;
agelist["three"]=300;
console.log(agelist);

