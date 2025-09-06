import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { PagesModule } from './pages/pages.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app/app.component';
import { FormsModule } from '@angular/forms';
import { CompanyDataComponent } from './app/company-data/company-data.component';

@NgModule({
  declarations: [
    AppComponent,
    CompanyDataComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    PagesModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
