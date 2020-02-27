import { Component, OnInit } from "@angular/core";
import { ApiService } from "./services/api.service";

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

  constructor(private apiService: ApiService) { }

  ngOnInit(){
    this.compareScreen = false;
  }

  compare(){
    this.compareScreen = true;
    this.apiService.compareRequest(this.textArea1, this.textArea2).subscribe(function (response) {
      this.comparedText = response;
    })
  }

  reset(){
    this.compareScreen = false;
  }
}
