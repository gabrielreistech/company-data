import { Component } from '@angular/core';
import { Client } from '../../interfaces/client-interface';

@Component({
  selector: 'app-sellers-list',
  templateUrl: './sellers-list.component.html',
  styleUrl: './sellers-list.component.css'
})
export class SellersListComponent {

   clients:Client[] = [];

   client:Client = {
     name: "Flávio Augusto",
     region: "Sul",
     totalSelled: 5000,
     mediumMonth: 400
   }
}
