import { Component } from '@angular/core';
import { SharedService } from './shared.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[SharedService]
  //provider는 service를 생성해주기 때문에 새로운 배열 생성
})
export class AppComponent {
  title = 'my-app';
  constructor(public service:SharedService){}
  addName(n:string){
    this.service.addName(n);
    console.log(this.service.names);
    
  }
}
