import { Component, OnInit } from '@angular/core';
import {Input} from "@angular/core";


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input() friends:any;


  constructor() { }

  ngOnInit(): void {
  }

}
