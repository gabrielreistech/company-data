import { Injectable } from '@angular/core';
import { Seller } from '../interfaces/seller-interface';
import { BehaviorSubject } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  seller:Seller[] = [];

  private listSellers = new BehaviorSubject<Seller[]>([]);
  
  public listSellers$ = this.listSellers.asObservable();

  private monthAverrage = new BehaviorSubject<number[]>([]);

  public monthAverrage$ = this.monthAverrage.asObservable();

  counter:number = {} as number;

  totalOfMonths:number[] = [];
  

  constructor(private http:HttpClient) { }

  addSeller(seller:Seller){
    console.log(seller + ' -> Foi enviado')
    this.http.post('http://localhost:8080/seller', seller)
       .subscribe({
        next: (data) => console.log('Resposta Backend' + data),
        error: (error) => console.log(error),
       });

    console.log(seller);
  }


  addSellerList(seller:Seller){
    const listCurrent = this.listSellers.getValue();
    const listUpdate = [...listCurrent, seller];
    this.listSellers.next(listUpdate);
 }


  calculoMedium(totalSelledYear:number): number{
    return parseFloat((totalSelledYear/12).toFixed(2));
  }

  totalOverallAverage(seller:Seller[]){
    for(let i = 0; i < seller.length; i++){
      if(seller[i] && seller[i].months){
       for(let j = 0; j < seller[i].months.length; j++){
        if(seller[i].months[j] != null){ 
        this.counter += seller[i].months[j];
       }
      }
      this.totalOfMonths.push(this.counter);
      this.monthAverrage.next(this.totalOfMonths);
      this.counter = 0;
     }
   }
 }
}
