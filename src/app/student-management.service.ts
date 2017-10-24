import {Injectable} from '@angular/core';
import {Student} from "./model/student";

@Injectable()
export class StudentManagementService {

  constructor() {
  }

  public students(): Student[] {
    return [
      new Student("Prv", "Student", "123456", "KNI"),
      new Student("Vtora", "Studentka", "123457", "PET"),
      new Student("Tret", "Student", "123458", "KNI"),
      new Student("Chetvrta", "Studentka", "123459", "MT"),
    ];
  }


}
