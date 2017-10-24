import {Component} from '@angular/core';
import {StudentManagementService} from "./student-management.service";
import {Student} from "./model/student";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  public students: Student[] = [];
  public currentStudent: Student;

  constructor(private studentService: StudentManagementService) {

  }

  ngOnInit(): void {
    this.students = this.studentService.students();
  }

  onSelect(student: Student) {
    this.currentStudent = student;
  }
}
