import { Component } from '@angular/core';
import { MoringService} from './moring-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[MoringService]///////등록
})
export class AppComponent {
  title = '국가별 아침인사 서비스 실습';
  country_code="KR";
  mesg="";
  //생성자를 통한 주입
  constructor(public service:MoringService) {  }
  handleEvent(event:any):void{
    this.country_code= event.target.value;
    this.mesg=this.service.sayHello(this.country_code);
  }
  
}
