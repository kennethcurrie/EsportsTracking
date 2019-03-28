import { Component, OnInit, NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-test-view',
  templateUrl: './test-view.component.html',
  styleUrls: ['./test-view.component.css']
})
@NgModule({
  imports: [NgbModule]
})
export class TestViewComponent implements OnInit {

  testVar = [345, 2345, 2345, 3453245, 345, 2345, 2, 345, 23, 45, 23452345, 2345, 2345, 2345, 34523, 23452345, 245, 3];

  constructor() {

  }

  ngOnInit() {
    console.log('hello world');
  }

}

