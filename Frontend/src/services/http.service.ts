import { Injectable } from '@angular/core';
import { Seller } from '../interfaces/seller-interface';
import { dataTransportService } from './dataTransport.service';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private dataService: dataTransportService) { }

  addSeller(seller:Seller){
    seller.mediumMonth = this.calculoMedium(seller.totalSelled);
    this.dataService.addSellerList(seller);
    console.log(seller);
  }

  calculoMedium(totalSelledYear:number): number{
    return parseFloat((totalSelledYear/12).toFixed(2));
 }

}
