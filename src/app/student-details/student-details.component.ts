import {Component, OnInit, Input} from '@angular/core';
import {Student} from "../model/student";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {Location}                 from '@angular/common';
import {StudentManagementService} from "../student-management.service";
import 'rxjs/add/operator/switchMap';

@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent implements OnInit {

  public student: Student;

  constructor(private studentService: StudentManagementService,
              private route: ActivatedRoute,
              private location: Location) {
  }

  ngOnInit() {
    this.route.paramMap
      .switchMap((params: ParamMap) => this.studentService.getStudent(params.get('id')))
      .subscribe(student => this.student = student);
  }

  goBack(): void {
    this.location.back();
  }

}
