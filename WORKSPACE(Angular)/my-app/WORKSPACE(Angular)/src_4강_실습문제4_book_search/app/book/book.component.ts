import { Component, OnInit } from '@angular/core';
import {Book} from './book';////////////import 
@Component({
  selector: 'app-book',   ///////////////////////app.component.html에 추가
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent  {
  titleName="도서목록";
  booksResult:Book[]=[];//생성자에서 book을 배열에 담아 보여줌
  books:Book[]=[
    {id:"p01", name:"위험한 식탁", price:2000, date:'20190401', img:'a.jpg'},
    {id:'p02',name:'공부의 비결',price:3000,date:'20170402',img:'b.jpg'},
    {id:'p03',name:'오메르타',   price:2500,date:'20170401',img:'c.jpg'},
    {id:'p04',name:'행복한 여행',price:4000,date:'20170401',img:'d.jpg'},
    {id:'p05',name:'해커스 토익',price:2000,date:'20170401',img:'e.jpg'},
    {id:'p06',name:'도로 안내서',price:2000,date:'20170401',img:'f.jpg'},
  ];
  constructor() { 
    for (var book of this.books) {
      this.booksResult.push(book);//객체 생성시 배열에 저장
    }
  }
  searchName(event:any){//검색어 입력시
    var searchName= event.target.value;
    this.booksResult=[];//초기화 후 검색결과 저장
    if(searchName==''){
      for (var book of this.books) {//검색어가 비어있는 경우 
        this.booksResult.push(book);
      }
    }else{
      for(var book of this.books){
        if(book.name.indexOf(searchName)!=-1){//검색어가 있다면
          this.booksResult.push(book);
        }
      }
    }
    console.log(this.booksResult);
  }//end 
  getTitleName():string{
    return this.titleName;
  }
//
  ngOnInit(): void {
  }

}
