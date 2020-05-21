import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../auth/token-storage.service';
import { Event } from '../entities/event';

@Component({
  selector: 'app-panier',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.css']
})
export class PanierComponent implements OnInit {

  constructor(private tokenStorage: TokenStorageService) { }

  events:Event[]

  ngOnInit() {
    if(this.tokenStorage.getToken())
    {
      this.events=this.tokenStorage.getUser().panier.events;
    }

    
  }

}
