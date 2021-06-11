import { Component, OnInit } from '@angular/core';
import { CustService } from './cust.service';
@Component({
  selector: 'app-cust',
  templateUrl: './cust.component.html',
  styleUrls: ['./cust.component.css'],
  providers:[CustService] //서비스등록
})
export class CustComponent implements OnInit {

  constructor(public custService:CustService) { }

  getCurrentDate():Date{
    return this.custService.currentDate();
  }
  ngOnInit(): void {
  }

}
