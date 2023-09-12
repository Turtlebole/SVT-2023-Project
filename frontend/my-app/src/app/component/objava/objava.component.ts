import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-objava',
  templateUrl: './objava.component.html',
  styleUrls: ['./objava.component.css']
})
export class ObjavaComponent {
  groups: any[] = []; // This array will store the fetched group data

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.fetchGroups();
  }

  fetchGroups() {
    this.http.get('http://localhost:8080/api/posts').subscribe((data: any) => {
      this.groups = data; // Assign the fetched data to your 'groups' array
      console.log(this.groups);
    });
  }
}
