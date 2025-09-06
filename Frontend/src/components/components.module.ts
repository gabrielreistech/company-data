import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddClientComponent } from './add-client/add-client.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AddClientComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [
    AddClientComponent,
  ]
})
export class ComponentsModule { }
