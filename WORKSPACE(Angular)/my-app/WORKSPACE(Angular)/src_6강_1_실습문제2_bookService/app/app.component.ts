import { Component } from '@angular/core';
import { Book } from './book/book';
import { BookService } from './book/book.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[BookService]
})
export class AppComponent {
  title = 'my-app';
  books:Book[]=[];
  constructor(public service:BookService){
    this.books=service.bookList();
  }
}
