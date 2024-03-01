import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ProductComponent } from './component';
import { FormsModule } from "@angular/forms";
import { PaAttrDirective } from "./attr.directive";

@NgModule({
  declarations: [
    ProductComponent,
    PaAttrDirective,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [ProductComponent]
})
export class AppModule { }
