import { Component } from '@angular/core';
import {Stock} from './stock';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '이벤트를 이용한 데이터 전달 실습';
  stocks:Stock[]=[];
  handleEvent(event:any){
    this.stocks.push(event);
    
  }
}
