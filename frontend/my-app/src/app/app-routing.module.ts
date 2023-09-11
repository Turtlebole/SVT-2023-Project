import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { RegisterComponent } from './component/register/register.component';
import { FriendsComponent } from './component/friends/friends.component';
import { ProfileComponent } from './component/profile/profile.component';
import { EditprofileComponent } from './component/editprofile/editprofile.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'friends', component: FriendsComponent},
  { path: 'profile', component: ProfileComponent},
  { path: 'editprofile', component: EditprofileComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
