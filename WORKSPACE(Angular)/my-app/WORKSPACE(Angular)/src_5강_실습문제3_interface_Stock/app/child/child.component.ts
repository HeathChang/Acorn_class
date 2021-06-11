import { Component, Input, OnInit } from '@angular/core';
import {Stock} from '../stock';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input() iStocks:Stock[]=[];//부모에게서 받은 데이터
  showStocks:Stock[]=[];
  handleEvent(){
    this.showStocks=this.iStocks;
  }

  
  constructor() { }

  ngOnInit(): void {
  }

}
