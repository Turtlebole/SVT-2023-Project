import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
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
