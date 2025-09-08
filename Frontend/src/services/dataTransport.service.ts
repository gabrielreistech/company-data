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

  private mediaMensal = new BehaviorSubject<number[]>([]);

  public mediaMensal$ = this.mediaMensal.asObservable();


  seller:Seller[] = [];

  contador:number = {} as number;

  totalDosMeses:number[] = [];

  
  addSellerList(seller:Seller){
    const listCurrent = this.listSellers.getValue();
    const listUpdate = [...listCurrent, seller];
    this.listSellers.next(listUpdate);
 }

  mediaMensalGeral(seller:Seller[]){
     for(let i = 0; i < seller.length; i++){
       if(seller[i] && seller[i].months){
        for(let j = 0; j < seller[i].months.length; j++){
         if(seller[i].months[j] != null){ 
         this.contador += seller[i].months[j];
        }
       }
       this.totalDosMeses.push(this.contador);
       this.mediaMensal.next(this.totalDosMeses);
       this.contador = 0;
      }
    }
  }
}
