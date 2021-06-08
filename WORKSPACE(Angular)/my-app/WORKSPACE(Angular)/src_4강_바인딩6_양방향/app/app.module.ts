import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  // imports: [ //양방향 바인딩 위해서는 module.ts에 import 해주고 
  //   BrowserModule,
  //   AppRoutingModule
  //   FormsModule //여기도 추가해주어야한다.
  // ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
