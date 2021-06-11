import { Component } from '@angular/core';
import {Stock} from './stock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  myStocks:Stock[]=[
    {stockSymbol:'Java', stockPrice:100},
    {stockSymbol:'Angular', stockPrice:400},
    {stockSymbol:'Oracle', stockPrice:300},
    {stockSymbol:'ECMAScript6', stockPrice:150}

  ]
}
