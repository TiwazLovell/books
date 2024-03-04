import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { ProductComponent } from './component';
import { FormsModule } from "@angular/forms";
import { PaAttrDirective } from "./attr.directive";
import { PaModel } from './twoway.directive';
import { PaStructureDirective } from './structure.directive';

@NgModule({
  declarations: [
    ProductComponent,
    PaAttrDirective,
    PaModel,
    PaStructureDirective
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [ProductComponent]
})
export class AppModule { }
