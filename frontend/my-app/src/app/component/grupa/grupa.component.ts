import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-grupa',
  templateUrl: './grupa.component.html',
  styleUrls: ['./grupa.component.css']
})
export class GrupaComponent {
  groups: any[] = []; // This array will store the fetched group data

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchGroups();
  }

  fetchGroups() {
    // Replace 'your-backend-url/groups' with the actual URL of your backend API
    this.http.get('http://localhost:8080/api/groups').subscribe((data: any) => {
      this.groups = data; // Assign the fetched data to your 'groups' array
    });
  }
}
