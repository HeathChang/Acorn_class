import { Component } from '@angular/core';
import { Person } from './Person';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '바인딩 실습';
  user={
  name:"무천도사",
  age:80,
  address:"서울",
}
  user2={
  name:"학도사",
  age:70,
  address:"무릉도원",
}
}