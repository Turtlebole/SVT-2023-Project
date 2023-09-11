import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  title = 'Bara Otome';

  isPopupOpen = false;

  openPopup() {
    this.isPopupOpen = true;
    console.log("cmardan");
  }

  closePopup() {
    this.isPopupOpen = false;
  }
  
}
