import { Component, EventEmitter, OnInit, Output } from '@angular/core';

import {Stock} from '../stock';

@Component({
  selector: 'app-stock-add',
  templateUrl: './stock-add.component.html',
  styleUrls: ['./stock-add.component.css']
})
export class StockAddComponent implements OnInit {
@Output() customEvent= new EventEmitter();
  constructor() { }
  add(s:Stock){
    this.customEvent.emit(s);//데이터전달
  }
  ngOnInit(): void {
  }

}
