import {Injectable} from '@angular/core';
import {Student} from "./model/student";

@Injectable()
export class StudentManagementService {

  public studentList: Student[] = [
    new Student("1", "Prv", "Student", "123456", "KNI"),
    new Student("2", "Vtora", "Studentka", "123457", "PET"),
    new Student("3", "Tret", "Student", "123458", "KNI"),
    new Student("4", "Chetvrta", "Studentka", "123459", "MT"),
  ];

  constructor() {
  }

  public students(): Promise<Student[]> {
    return Promise.resolve(this.studentList);
  }


  getStudent(id: string): Promise<Student> {
    console.log(id)
    return this.students()
      .then(student => student.find(student => student.id === id));
  }
}
