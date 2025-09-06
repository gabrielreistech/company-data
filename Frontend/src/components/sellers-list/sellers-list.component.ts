import { Component } from '@angular/core';
import { Seller } from '../../interfaces/seller-interface';

@Component({
  selector: 'app-sellers-list',
  templateUrl: './sellers-list.component.html',
  styleUrl: './sellers-list.component.css'
})
export class SellersListComponent {

  sellers:Seller[] = [];

   seller:Seller = {
     name: "Flávio Augusto",
     region: "Sul",
     totalSelled: 5000,
     mediumMonth: 400
   }
}
