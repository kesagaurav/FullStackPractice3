import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { ViewHotelComponent } from './view-hotel/view-hotel.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'


@NgModule({
  declarations: [
    AppComponent,
    AddHotelComponent,
    ViewHotelComponent,
    UpdateHotelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
