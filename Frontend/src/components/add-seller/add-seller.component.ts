import { Component } from '@angular/core';
import { Seller } from '../../interfaces/seller-interface';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'app-add-seller',
  templateUrl: './add-seller.component.html',
  styleUrl: './add-seller.component.css'
})
export class AddSellerComponent {

  constructor(private sellerService: HttpService){}

  nameButton:string = 'Adicionar';

  seller:Seller = {} as Seller;

  addSeller(seller:Seller){
     this.sellerService.addSeller(seller);
  }

}
