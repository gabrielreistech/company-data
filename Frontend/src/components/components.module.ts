import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddClientComponent } from './add-client/add-client.component';
import { FormsModule } from '@angular/forms';
import { CompanyDataComponent } from './company-data/company-data.component';
import { SellersListComponent } from './sellers-list/sellers-list.component';
import { CardComponent } from './card/card.component';
import { LineChartComponent } from './line-chart/line-chart.component';

@NgModule({
  declarations: [
    AddClientComponent,
    CompanyDataComponent,
    SellersListComponent,
    CardComponent,
    LineChartComponent,
  ],
  imports: [
    CommonModule,
    FormsModule,
  ],
  exports: [
    AddClientComponent,
    CompanyDataComponent,
    SellersListComponent
  ]
})
export class ComponentsModule { }
