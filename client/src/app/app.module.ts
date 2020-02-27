import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EscapeHtmlPipe } from './pipes/keep-html.pipe';

import { AppComponent } from './app.component';

@NgModule({
  imports:      [ BrowserModule, FormsModule, HttpClientModule],
  declarations: [ AppComponent, EscapeHtmlPipe],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
