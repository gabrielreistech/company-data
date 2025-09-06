import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddClientComponent } from './add-client/add-client.component';
import { FormsModule } from '@angular/forms';
import { CompanyDataComponent } from './company-data/company-data.component';
import { SellersListComponent } from './sellers-list/sellers-list.component';

@NgModule({
  declarations: [
    AddClientComponent,
    CompanyDataComponent,
    SellersListComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [
    AddClientComponent,
    CompanyDataComponent,
  ]
})
export class ComponentsModule { }
