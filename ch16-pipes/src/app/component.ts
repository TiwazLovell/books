import { Component } from "@angular/core";
import { Model } from "./repository.mode";
import { Product } from "./product.model";

@Component({
    selector: "app",
    templateUrl: "template.html",
})
export class ProductComponent {

    model: Model = new Model();

    addProduct(p: Product) {
        this.model.saveProduct(p);
    }

}