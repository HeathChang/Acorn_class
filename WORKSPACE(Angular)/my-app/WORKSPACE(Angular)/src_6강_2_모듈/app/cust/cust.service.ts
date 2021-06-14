import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustService {

  constructor() { }
  currentDate(){ //공통로직 구현
    return new Date();
  }
}
