import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { UserComponent } from './user/user.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';


import { httpInterceptorProviders } from './auth/auth-interceptor';
import { MenuComponent } from './menu/menu.component';
import { ListUserComponent } from './list-user/list-user.component';
import { FooterComponent } from './footer/footer.component';
import { AvisComponent } from './avis/avis.component';
import { PanierComponent } from './panier/panier.component';
import { EventCreatorComponent } from './event-creator/event-creator.component';
import { RequirementComponent } from './requirement/requirement.component';
import { ListAvisComponent } from './list-avis/list-avis.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserComponent,
    RegisterComponent,
    HomeComponent,
    AdminComponent,
    MenuComponent,
    ListUserComponent,
    FooterComponent,
    AvisComponent,
    PanierComponent,
    EventCreatorComponent,
    RequirementComponent,
    ListAvisComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [httpInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
