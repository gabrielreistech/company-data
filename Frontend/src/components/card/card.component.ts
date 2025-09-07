import { Component, Input } from '@angular/core';
import { Seller } from '../../interfaces/seller-interface';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {

  @Input() seller?: Seller | undefined;

  nameButton:string = 'Desligar';
}
