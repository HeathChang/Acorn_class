import { Component, OnInit } from '@angular/core';
import { CustService } from 'WORKSPACE(Angular)/src_6강_1_서비스_기본_1/app/cust/cust.service';

@Component({
  selector: 'app-cust',
  templateUrl: './cust.component.html',
  styleUrls: ['./cust.component.css'],
  providers:[CustService]
})
export class CustComponent implements OnInit {

  constructor(public custService:CustService) { }
  getMesg(){
    return this.custService.currentDate();
  }
  ngOnInit(): void {
  }

}
