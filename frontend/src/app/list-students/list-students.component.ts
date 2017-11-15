import {Component, OnInit} from '@angular/core';
import {StudentManagementService} from "../student-management.service";
import {Student} from "../model/student";

@Component({
  selector: 'app-list-students',
  templateUrl: './list-students.component.html',
  styleUrls: ['./list-students.component.css']
})
export class ListStudentsComponent implements OnInit {

  title = 'app';
  public students: Student[] = [];
  public currentStudent: Student;

  constructor(private studentService: StudentManagementService) {

  }

  ngOnInit(): void {
    this.studentService.students()
      .then(videos => this.students = videos)
      .catch(error => console.error(error.errorMessage));
  }

  onSelect(student: Student) {
    this.currentStudent = student;
  }

}
