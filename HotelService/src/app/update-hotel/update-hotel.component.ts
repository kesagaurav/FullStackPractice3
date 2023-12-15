import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Hotel } from '../hotel';
import { ActivatedRoute, Router } from '@angular/router';
import { HotelService } from '../hotel.service';

@Component({
  selector: 'app-update-hotel',
  templateUrl: './update-hotel.component.html',
  styleUrls: ['./update-hotel.component.css']
})
export class UpdateHotelComponent implements OnInit{
  hotelForm!:FormGroup;
  hotel!:Hotel;
  id!:number;
  constructor(private fb:FormBuilder,private router:Router,private service:HotelService,private router2:ActivatedRoute) {
    //this.hotel=new Hotel();

  }
  ngOnInit(): void {
    // this.hotelForm=this.fb.group({
    //   foodName:['',[Validators.required,Validators.pattern("[a-z]{1,}")]],
    //   family:['',[Validators.required,Validators.pattern("[0-9]{1,}")]],
    //   amount:['',[Validators.required,Validators.pattern("[0-9]{1,}")]],
    //   rating:['',[Validators.required,Validators.max(5),Validators.pattern("[0-5]{5}")]]
    // })
    this.id=this.router2.snapshot.params['id'];
    console.log(this.id);
    this.service.getHotel(this.id).subscribe(res=>{
      this.hotel=res;
    })


  }

  updateHotel(h:Hotel){
    this.service.updateHotel(this.hotel,this.id).subscribe(
      {
        next:data=>{
          this.hotel=data;
          console.log(data);

          console.log('the route is navigating');

          this.router.navigate(['/viewHotel']);

        },
        error:(err)=>{
          console.log('something went wrong');

        },
        complete:()=>{
          console.log('successfully completed');

        }




      }
    )
  }
}
