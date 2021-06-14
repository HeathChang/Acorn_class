import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {StockModule} from './stock/stock.module';////////
import {MorningModule} from './morning/morning.module';/////

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    StockModule,///////////////////////////////,
    MorningModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
