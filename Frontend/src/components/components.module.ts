import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddSellerComponent } from './add-seller/add-seller.component';
import { FormsModule } from '@angular/forms';
import { CompanyDataComponent } from './company-data/company-data.component';
import { SellersListComponent } from './sellers-list/sellers-list.component';
import { CardComponent } from './card/card.component';
import { LineChartComponent } from './line-chart/line-chart.component';
import { ButtonComponent } from './button/button.component';

@NgModule({
  declarations: [
    AddSellerComponent,
    CompanyDataComponent,
    SellersListComponent,
    CardComponent,
    LineChartComponent,
    ButtonComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [
    AddSellerComponent,
    CompanyDataComponent,
    SellersListComponent,
    LineChartComponent,
    ButtonComponent,
  ]
})
export class ComponentsModule { }
