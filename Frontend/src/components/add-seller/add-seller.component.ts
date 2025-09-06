import { Component } from '@angular/core';
import { Seller } from '../../interfaces/seller-interface';

@Component({
  selector: 'app-add-seller',
  templateUrl: './add-seller.component.html',
  styleUrl: './add-seller.component.css'
})
export class AddSellerComponent {

  seller:Seller = {} as Seller;
 
  seeSeller(seller:Seller){
    this.calculoMedium(seller.totalSelled);
    console.log(seller);
  }

  calculoMedium(totalSelledYear:number): void{
      this.seller.mediumMonth = parseFloat((totalSelledYear/12).toFixed(2));
  }
}
