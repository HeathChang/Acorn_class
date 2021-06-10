import { Component } from '@angular/core';
import { ChildComponent } from './child/child.component';
import { ViewChild } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  data="홍길동";
  @ViewChild("kkk") Child!:ChildComponent

  send(){
    this.Child.prev_num=10;
    this.Child.cur_num++;
  }
  
  clear(){
    this.Child.prev_num=0
    this.Child.cur_num=0
  }
}
