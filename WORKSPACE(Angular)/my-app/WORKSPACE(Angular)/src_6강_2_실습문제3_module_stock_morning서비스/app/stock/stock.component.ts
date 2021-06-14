import { Component, OnInit } from '@angular/core';
import { Stock } from './stock';

@Component({
  selector: 'app-stock',
  templateUrl: './stock.component.html',
  styleUrls: ['./stock.component.css']
})
export class StockComponent implements OnInit {
  //Stock의배열
  stocks:Stock[]=[];
  constructor() { }
  handleEvent(event:Stock){
    this.stocks.push(event);
    console.log(this.stocks);
  }
  ngOnInit(): void {
  }

}
