import { Component, OnInit } from '@angular/core';
import { Event } from '../entities/event';
import { EventCreatorService } from '../services/event-creator.service';
import { TokenStorageService } from '../auth/token-storage.service';
import { concat } from 'rxjs';


@Component({
  selector: 'app-event-creator',
  templateUrl: './event-creator.component.html',
  styleUrls: ['./event-creator.component.css']
})
export class EventCreatorComponent implements OnInit {

  event = new Event()
  private roles: string[];
  private authority: string;

  constructor(private eventCreatorService : EventCreatorService , private tokenStorage: TokenStorageService) { }

  ngOnInit() {
    /*this.AvisService.findAvis().subscribe((res)=>{
      if (this.tokenStorage.getToken()) {
        this.roles = this.tokenStorage.getAuthorities();
        this.roles.every(role => {
          if (role === 'ROLE_ADMIN') {
            this.authority = 'admin';
            return false;
          }
          this.authority = 'user';
          return true;
        });}
      this.aviss= res;
      console.log(this.aviss);
    } );*/
  }

  addEvent(event:Event){
    if (this.tokenStorage.getToken()) {
    this.roles = this.tokenStorage.getAuthorities();
    this.roles.every(role => {
      if (role === 'ROLE_USER') {
        this.authority = 'user';
        return false;
      }
      this.authority = 'user';
      return true;
    });
    }
    this.event.panier=this.tokenStorage.getUser().panier  
    console.log(this.event)
    this.eventCreatorService.addEvent(this.event).subscribe(Response =>{console.log("Event added")});
  }


}
