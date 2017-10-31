import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {StudentDetailsComponent} from './student-details/student-details.component';
import {StudentManagementService} from "./student-management.service";
import {ListStudentsComponent} from './list-students/list-students.component';
import {RouterModule} from "@angular/router";


@NgModule({
  declarations: [
    AppComponent,
    StudentDetailsComponent,
    ListStudentsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {
        path: 'list',
        component: ListStudentsComponent
      },
      {
        path: 'details/:id',
        component: StudentDetailsComponent
      }
    ])
  ],
  providers: [StudentManagementService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
