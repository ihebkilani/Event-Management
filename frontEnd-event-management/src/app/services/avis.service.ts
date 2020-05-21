import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Avis } from '../entities/avis';

@Injectable({
  providedIn: 'root'
})
export class AvisService {

  private baseurl ="http://localhost:8080/Avis"

  constructor(private http : HttpClient) { }

  addAvis(avis : Avis){
    console.log(avis)
    return this.http.post(this.baseurl,avis);
  }

  findAvis(){
    return this.http.get<Avis[]>(this.baseurl);
  }
}
