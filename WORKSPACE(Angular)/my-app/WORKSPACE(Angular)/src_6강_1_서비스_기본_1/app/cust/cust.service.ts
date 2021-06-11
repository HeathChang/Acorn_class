import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustService{
  constructor() { }
  currentDate(){
    return new Date();
  }
}
