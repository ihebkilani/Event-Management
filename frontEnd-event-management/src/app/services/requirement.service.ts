import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from '../entities/event';
import { Requirement } from '../entities/requirement';

@Injectable({
  providedIn: 'root'
})
export class RequirementService {
  private baseurl ="http://localhost:8080/requirement"

  constructor(private http : HttpClient) { }

  addEvent(budget : number){
    console.log(event)
    return this.http.get<Requirement[]>(this.baseurl);
  }

  /*deleteEvent(){
    return this.http.delete(this.baseurl);
  }*/
}
