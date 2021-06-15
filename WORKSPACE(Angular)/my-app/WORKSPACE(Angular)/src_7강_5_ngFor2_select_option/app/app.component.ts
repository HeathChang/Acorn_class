import { Component } from '@angular/core';
import {Person} from './person';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  names:string[]=["홍길동","이순신","유관순"];
  constructor(){}
}
