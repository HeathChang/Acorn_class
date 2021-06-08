import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '이벤트 바인딩 실습';
  handleEvent(event:any):void{ //이벤트 처리 콜백 함수
    console.log("HandleEvent",event);
  }
  handleEvent2(event:any,name:string):void{
    console.log("HandleEvent2=====",event,name);
  }
  handleEvent3($event: any):void{
    console.log("HandleEvent3=====",$event);
  }
}
