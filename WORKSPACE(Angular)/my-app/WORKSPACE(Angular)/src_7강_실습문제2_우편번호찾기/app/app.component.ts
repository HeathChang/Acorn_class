import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app';
  category1:string[]=[
    "서울","경기","부산","제주"
  ]
  
  category2=[
    ["강남구1","종로구1","용산구1"],
    ["강남구2","종로구2","용산구2"],
    ["강남구3","종로구3","용산구3"],
    ["강남구4","종로구4","용산구4"]
    ]
  kkk:string[]=[];
  result:string[]=[];
  select(m:string){
    this.kkk=[];
    console.log(m);
    for (let index = 0; index < this.category1.length; index++) {
      if (this.category1[index]==m) {
        this.result=this.category2[index];
        //for (let index = 0; index < result.length; index++) {
        //   this.kkk.push(result[index]);          
        //}
      }
      
    }
    console.log(this.kkk);
    
    
    
  }


}
