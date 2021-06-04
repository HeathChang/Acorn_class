import { Component } from '@angular/core';

@Component({
  selector: 'app-root',  //selector 이름, index.html에서 참조해 사용
  //template: backtick 사용
  template: ` 
  <table>
    <tr>
      <td><h1>홍길동</h1></td>
    </tr>
  </table>
  `,

  //templateUrl: ['./app.component.html']
  //styleUrls: ['./app.component.css']

  styles:[
    `h1{
      color:red
    }`,
    `h2{
      background:red
    }`
  ]
})
export class AppComponent { 
  title = 'my-app';
  //안에서 처리한 데이터
}
