import { Component } from "@angular/core";
import { Model } from "./repository.mode";
import { Product } from "./product.model";

@Component({
    selector: "app",
    templateUrl: "template.html",
    // styles: ["div { border: 2px black solid; font-style:italic }"]
    styles: ["/deep/ div { border: 2px black solid; font-style:italic }"]
})
export class ProductComponent {

    model: Model = new Model();

    addProduct(p: Product) {
        this.model.saveProduct(p);
    }

}
