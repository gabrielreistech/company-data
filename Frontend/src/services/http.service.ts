import { Injectable } from '@angular/core';
import { Seller } from '../interfaces/seller-interface';
import { dataTransportService } from './dataTransport.service';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  constructor(private dataService: dataTransportService, private http:HttpClient) { }

  addSeller(seller:Seller){
    console.log(seller + ' -> Foi enviado')
    this.http.post('http://localhost:8080/seller', seller)
       .subscribe({
        next: (data) => console.log('Resposta Backend' + data),
        error: (error) => console.log(error),
       });

    
    //seller.mediumMonth = this.calculoMedium(seller.totalSelled);
    //this.dataService.addSellerList(seller);
    console.log(seller);
  }

  viewSellerList(){}
  

  calculoMedium(totalSelledYear:number): number{
    return parseFloat((totalSelledYear/12).toFixed(2));
  }
}
