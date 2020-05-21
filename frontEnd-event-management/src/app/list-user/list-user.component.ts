import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service'

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit {
  users :any
  constructor(private UserService:UserService) { }

  ngOnInit() {
    this.UserService.getUsers().subscribe((res)=>{
      console.log(res);
      this.users= res;
    } );
  }

}
