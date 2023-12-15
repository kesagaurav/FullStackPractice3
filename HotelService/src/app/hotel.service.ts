import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hotel } from './hotel';

@Injectable({
  providedIn: 'root'
})
export class HotelService {
  url=''
  constructor(private http:HttpClient){
    this.url='http://localhost:9084/hotel';
  }

  addHotel(h:Hotel):Observable<Hotel>{
    return this.http.post<Hotel>(this.url,h);
  }

  updateHotel(h:Hotel,id:number):Observable<Hotel>{
    return this.http.put<Hotel>(`${this.url}/${id}`,h);//localhost:9084/hotel/id
  }

  getHotel(id:number):Observable<any>{
    return this.http.get(this.url + `/${id}`);
  }



  deleteHotel(id:number):Observable<any>{
    return this.http.delete(this.url + `/${id}`);
  }


  getAllHotels():Observable<Hotel[]>{
    return this.http.get<Hotel[]>(this.url + 's');
  }





}
