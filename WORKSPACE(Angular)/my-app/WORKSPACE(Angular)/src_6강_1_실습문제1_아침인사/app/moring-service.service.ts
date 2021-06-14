import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MoringService {
  //공통기능의 구현
  sayHello(code:string):string{
    var mesg="";
    if(code=="KR"){
      mesg="안녕하세요? 좋은 아침입니다";
    }else if(code=="US"){
      mesg="Good Morning";
    }else if(code=="CN"){
      mesg="짜오 안";
    }else if(code=="JP"){
      mesg="오하요 고자이마스";
    }
    return mesg;
  }

  constructor() { }
}
