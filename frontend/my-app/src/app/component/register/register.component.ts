import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { NgModel } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  registration = {
    username: '',
    password: '',
    email: '',
    firstName: '',
    lastName: '',
  };

  constructor(private http: HttpClient, private router: Router) { }

  onSubmit() {
    console.log('Registration Data:', this.registration);
    // Define the URL and request headers
    const url = 'http://localhost:8080/api/users/register';
    const headers = new HttpHeaders({
      'Content-Type': 'application/json'
    });

    // Send the POST request
    this.http.post(url, this.registration, { headers })
      .subscribe(
        (response) => {
          console.log('Registration successful', response);
          this.router.navigate(['/home']);
          // You can handle the response here, e.g., redirect to a success page.
        },
        (error) => {
          console.error('Registration failed', error);
          // Handle the error, e.g., show an error message to the user.
        }
      );
  }


openLogin() {
  this.router.navigate(['/home']);
}


}
