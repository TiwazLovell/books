import { Component, Input, QueryList, ViewChildren } from "@angular/core";
import { Model } from "./repository.mode";
import { Product } from "./product.model";

@Component({
    selector: "paProductTable",
    templateUrl: "productTable.component.html"
})
export class ProductTableComponent {

    @Input("model")
    dataModel: Model | undefined;

    getProduct(key: number): Product | undefined {
        return this.dataModel?.getProduct(key);
    }

    getProducts(): Product[] | undefined {
        return this.dataModel?.getProducts();
    }

    deleteProduct(key: number) {
        this.dataModel?.deleteProduct(key);
    }

    taxRate: number = 0;
    categoryFilter: string | undefined;
    itemCount: number = 3;
}
