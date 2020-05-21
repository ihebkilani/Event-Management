import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from '../entities/event';

@Injectable({
  providedIn: 'root'
})
export class EventCreatorService {
  private baseurl ="http://localhost:8080/Event"

  constructor(private http : HttpClient) { }

  addEvent(event : Event){
    console.log(event)
    return this.http.post(this.baseurl,event);
  }

  /*deleteEvent(){
    return this.http.delete(this.baseurl);
  }*/
}
