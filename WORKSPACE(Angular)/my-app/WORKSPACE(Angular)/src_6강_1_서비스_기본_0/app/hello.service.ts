import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor() { }
  sayHello():string{ //공통기능 구현
    return "Hello  서비스"
  }
}
