import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-man',
  templateUrl: './man.component.html',
  styleUrls: ['./man.component.css']
  //provider 등록 안함: 부모가 쓰는 service 사용
})
export class ManComponent implements OnInit {

  constructor(public service:SharedService) { }
  addName(n:string){
    this.service.addName(n);
    console.log(this.service.names);
    
  }
  ngOnInit(): void {
  }

}
