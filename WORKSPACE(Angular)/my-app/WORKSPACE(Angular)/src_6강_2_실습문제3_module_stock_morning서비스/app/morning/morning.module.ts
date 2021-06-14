import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MorningComponent } from './morning.component';



@NgModule({
  declarations: [
    MorningComponent
  ],
  exports:[MorningComponent],/////////////////////app.module에서 import
  imports: [
    CommonModule
  ]
})
export class MorningModule { }
