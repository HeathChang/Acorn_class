import { Component, OnInit } from '@angular/core';
import {Input} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})

export class ChildComponent implements OnInit {
  @Input() send_data:string=""; //부모에서 전송되는 데이터
  //부모에서 전송되는 데이터
  prev_num: number=0; //부모에서 직접 사용되는 데이터
  cur_num: number=0;

  constructor() { }

  ngOnInit(): void {
  }

}
