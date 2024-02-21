import { Component } from "@angular/core";
import { Model } from "./repository.mode";

@Component({
    selector: "app",
    templateUrl: "template.html"
})
export class ProductComponent {
    model: Model = new Model();
}