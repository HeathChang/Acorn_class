import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '부모에서 자식으로 데이터 전달';
  //자식에게 전달할 데이터
  app_username="홍길동";
  app_userage="20";
}
//<!-- formModules app.modue.ts에 추가 -->
