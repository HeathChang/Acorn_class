import { Component, OnInit } from '@angular/core';
import {Input} from '@angular/core';
import {Stock} from './stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  title="인터페이스를 사용한 데이터 전달"
  @Input()
  iStock!: Stock; //!:초기값 할당
  stockSymbol:string="";
  stockPrice:number=0;

  handleEvent(){
    this.stockSymbol=this.iStock.stockSymbol;
    this.stockPrice=this.iStock.stockPrice;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
