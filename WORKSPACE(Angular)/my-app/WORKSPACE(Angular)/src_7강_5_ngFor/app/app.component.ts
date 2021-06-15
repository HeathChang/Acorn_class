import { Component } from '@angular/core';
import { Person } from './person';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  items:Person[]=[
    {name:"홍길동",age:20},
    {name:"이순신",age:30},
    {name:"유관순",age:40},
]
  constructor(){
    console.log(this.items);
    
  }
}
