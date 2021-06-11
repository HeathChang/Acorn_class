import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SharedService {
  names:string[]=[];
  addName(n:string){
    this.names.push(n);
  }
  constructor() { }
}
