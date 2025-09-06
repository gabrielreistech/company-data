import { Component, Input } from '@angular/core';
import { Client } from '../../interfaces/client-interface';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.css'
})
export class CardComponent {

  @Input() client?: Client | undefined;
}
