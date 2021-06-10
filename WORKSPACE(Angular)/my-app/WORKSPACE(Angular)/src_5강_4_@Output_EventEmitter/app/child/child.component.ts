import { Component, OnInit } from '@angular/core';
import {Output,EventEmitter} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Output() customEvent = new EventEmitter(); //키 값으로 사용
  send(name:string){
    this.customEvent.emit(name); //부모에게 데이터 전달
  }

  constructor() { }

  ngOnInit(): void {
  }

}
