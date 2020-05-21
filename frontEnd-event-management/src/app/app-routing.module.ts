import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { ListUserComponent } from './list-user/list-user.component';
import { AdminComponent } from './admin/admin.component';
import { AvisComponent } from './avis/avis.component';
import { PanierComponent } from './panier/panier.component';
import { EventCreatorComponent } from './event-creator/event-creator.component';
import { ListAvisComponent } from './list-avis/list-avis.component';

const routes: Routes = [
    {
        path: 'home',
        component: HomeComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
        path: 'admin',
        component: AdminComponent
    },
    {
        path: 'event',
        component: EventCreatorComponent
    },  
    {
        path: 'avis',
        component: AvisComponent
    },
    {
        path: 'listAvis',
        component: ListAvisComponent
    },
    {
        path: 'auth/login',
        component: LoginComponent
    },
    {
        path: 'signup',
        component: RegisterComponent
    },
    {
        path: 'panier',
        component: PanierComponent
    },
    {
        path: 'listUser',
        component: ListUserComponent
    },
    {
        path: '',
        redirectTo: 'home',
        pathMatch: 'full'
    }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }
