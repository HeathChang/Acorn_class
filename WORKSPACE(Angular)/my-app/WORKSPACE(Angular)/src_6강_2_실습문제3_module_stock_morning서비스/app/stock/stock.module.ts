import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StockComponent } from './stock.component';
import { StockAddComponent } from './stock-add/stock-add.component';



@NgModule({
  declarations: [
    StockComponent,
    StockAddComponent
  ],
  exports:[StockComponent], //모듈에서 사용하여 import없이 사용
  //app.module에 등록
  imports: [
    CommonModule
  ]
})
export class StockModule { }
