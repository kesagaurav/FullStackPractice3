import { Component, OnInit } from '@angular/core';
import { Hotel } from '../hotel';
import { HotelService } from '../hotel.service';
import { find, findIndex } from 'rxjs';

@Component({
  selector: 'app-view-hotel',
  templateUrl: './view-hotel.component.html',
  styleUrls: ['./view-hotel.component.css']
})
export class ViewHotelComponent implements OnInit{

  hotel!:Hotel[];
  id!:number;
  constructor(private service:HotelService){

  }
  ngOnInit(): void {
   this.service.getAllHotels().subscribe(res=>{
    this.hotel=res;
   });
  }


  deleteId(id:number){
    this.service.deleteHotel(id).subscribe(res=>{
      const i=this.hotel.findIndex(a=>a.hid==id);
      // if(i!=-1){
      //   this.hotel.slice(1,i);
      // }
      console.log(res);
      alert('id is deleted')
      this.ngOnInit();


    })
  }

}
