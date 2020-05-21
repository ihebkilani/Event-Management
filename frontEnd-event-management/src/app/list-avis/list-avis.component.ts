import { Component, OnInit } from '@angular/core';
import { Avis } from '../entities/avis';
import { AvisService } from '../services/avis.service';
import { User } from '../entities/user';
import { TokenStorageService } from '../auth/token-storage.service';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-list-avis',
  templateUrl: './list-avis.component.html',
  styleUrls: ['./list-avis.component.css']
})
export class ListAvisComponent implements OnInit {
  avis : Avis = new Avis;
  aviss :Avis[]
  token : any
  private authority: string;
  private roles: string[];
  user : User=new User()

  constructor(private AvisService: AvisService,private UserService:UserService,private tokenStorage: TokenStorageService) { }

  ngOnInit() {
    this.AvisService.findAvis().subscribe((res)=>{
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
    } );
  }
}
