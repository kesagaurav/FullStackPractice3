import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddHotelComponent } from './add-hotel/add-hotel.component';
import { ViewHotelComponent } from './view-hotel/view-hotel.component';
import { UpdateHotelComponent } from './update-hotel/update-hotel.component';

const routes: Routes = [
  {path:'addHotel',component:AddHotelComponent},
  {path:'viewHotel',component:ViewHotelComponent},
  {path:'updateHotel/:id',component:UpdateHotelComponent},
  {path:'**',redirectTo:'/addHotel',pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
