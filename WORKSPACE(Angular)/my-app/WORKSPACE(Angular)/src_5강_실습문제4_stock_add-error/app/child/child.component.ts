import { Component, OnInit, Output } from '@angular/core';
import {EventEmitter} from '@angular/core';
import {Stock} from '../stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Output() customEvent = new EventEmitter();
  stock!: Stock;
  add(data:Stock){
    this.stock=data;
    this.customEvent.emit(this.stock);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
