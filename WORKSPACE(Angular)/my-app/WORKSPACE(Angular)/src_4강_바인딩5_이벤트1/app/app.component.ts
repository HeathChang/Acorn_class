import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '이벤트 바인딩 실습';
  handleEvent():void{ //이벤트 처리 콜백 함수
    console.log("HandleEvent");
  }
  handleEvent2(name:string):void{
    console.log("HandleEvent2=====",name);
    
  }
}
