import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "template reference variable #var 실습";
 flag=false;
 callPhone(m:string){
   console.log("callPhone ===",m);
  }
  change(m:string){
    console.log("callPhone ===",m);
  }
  check(m:boolean){
    console.log("check ===", m);
    this.flag=m;  //m을 통한 객체 변수의 값 변경
  }
}