import { Component } from '@angular/core';
import { Client } from '../../interfaces/client-interface';

@Component({
  selector: 'app-add-client',
  templateUrl: './add-client.component.html',
  styleUrl: './add-client.component.css'
})
export class AddClientComponent {

  client:Client = {} as Client;
 
  seeClient(client:Client){
    this.calculoMedium(client.totalSelled);
    console.log(client);
  }

  calculoMedium(totalSelledYear:number): void{
      this.client.mediumMonth = parseFloat((totalSelledYear/12).toFixed(2));
  }
}
