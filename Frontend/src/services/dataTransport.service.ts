import { Injectable } from '@angular/core';
import { Seller } from '../interfaces/seller-interface';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class dataTransportService {

  constructor() { }

  private listSellers = new BehaviorSubject<Seller[]>([]);
  
  public listSellers$ = this.listSellers.asObservable();

  private monthAverrage = new BehaviorSubject<number[]>([]);

  public monthAverrage$ = this.monthAverrage.asObservable();


  seller:Seller[] = [];

  counter:number = {} as number;

  totalOfMonths:number[] = [];

  
  addSellerList(seller:Seller){
    const listCurrent = this.listSellers.getValue();
    const listUpdate = [...listCurrent, seller];
    this.listSellers.next(listUpdate);
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
