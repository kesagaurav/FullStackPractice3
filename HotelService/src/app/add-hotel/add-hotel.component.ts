import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HotelService } from '../hotel.service';
import { Hotel } from '../hotel';

@Component({
  selector: 'app-add-hotel',
  templateUrl: './add-hotel.component.html',
  styleUrls: ['./add-hotel.component.css']
})
export class AddHotelComponent implements OnInit{
  hotelForm!:FormGroup;
  hotel!:Hotel;
  constructor(private fb:FormBuilder,private router:Router,private service:HotelService) {
    this.hotel=new Hotel();

  }
  ngOnInit(): void {
    this.hotelForm=this.fb.group({
      foodName:['',[Validators.required,Validators.pattern("[a-z]{1,}")]],
      family:['',[Validators.required,Validators.pattern("[0-9]{1,}")]],
      amount:['',[Validators.required,Validators.pattern("[0-9]{1,}")]],
      rating:['',[Validators.required,Validators.max(5),Validators.pattern("[0-5]{5}")]]
    })
  }

  addHotel(){
    this.service.addHotel(this.hotelForm.value).subscribe(
      {
        next:data=>{
          console.log(this.hotelForm.value);
          data=this.hotelForm.value;
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
