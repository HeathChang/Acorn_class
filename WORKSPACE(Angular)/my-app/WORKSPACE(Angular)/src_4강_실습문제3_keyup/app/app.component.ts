import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '이벤트 바인딩 실습 ';
  input:string="";
  handleEvent(event:any){
    this.input=event.target.value.length;
    console.log(this.input);
    
  }
}
