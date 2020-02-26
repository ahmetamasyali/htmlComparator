import { Component, OnInit } from "@angular/core";

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent implements OnInit{
  name = 'Angular';
  compareScreen;
  textArea1;
  textArea2; 
  comparedText;

  ngOnInit(){
    this.compareScreen = false;
  }

  compare(){
    this.compareScreen = true;
    this.comparedText = this.textArea1;
    console.log(this.textArea1);
  }

  reset(){
    this.compareScreen = false;
  }
}
