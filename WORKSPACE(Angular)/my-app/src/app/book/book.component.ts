import { Component, OnInit } from '@angular/core';
import { Input } from '@angular/core';
import {Book} from './book';


@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  @Input() bookList:Book[]=[];
  @Input() title:string="";

  constructor() { }

  ngOnInit(): void {
  }

}
