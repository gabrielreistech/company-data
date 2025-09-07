import { Component } from '@angular/core';
import { Seller } from '../../interfaces/seller-interface';
import { dataTransportService } from '../../services/dataTransport.service';
import { HttpService } from '../../services/http.service';

@Component({
  selector: 'app-add-seller',
  templateUrl: './add-seller.component.html',
  styleUrl: './add-seller.component.css'
})
export class AddSellerComponent {

  constructor(private sellerService: HttpService){}

  seller:Seller = {} as Seller;

  nameButton:string = 'Adicionar';

  addSeller(seller:Seller){
     this.sellerService.addSeller(seller);
  }

}
