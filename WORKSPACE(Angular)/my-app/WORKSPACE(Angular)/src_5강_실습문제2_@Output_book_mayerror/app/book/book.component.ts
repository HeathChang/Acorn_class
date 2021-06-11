import { Component, OnInit, Output } from '@angular/core';
import { Input } from '@angular/core';
import {Book} from './book';
import {EventEmitter} from '@angular/core';


@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  @Input() bookList:Book[]=[];
  @Input() title:string="";
  @Output() customEvent =new EventEmitter();
  send(m:string){
    this.customEvent.emit(m);
  }
  constructor() { }

  ngOnInit(): void {
  }

}
