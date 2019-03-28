import { Component, OnInit, NgModule } from '@angular/core';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { fetchClient } from 'src/axios/sms-clients/fetch-client';

@Component({
  selector: 'app-test-view',
  templateUrl: './test-view.component.html',
  styleUrls: ['./test-view.component.scss']
})
@NgModule({
  imports: [NgbModule]
})
export class TestViewComponent implements OnInit {

  testVar = [];

  constructor() {
  }

  ngOnInit() {
    const func = async () => {
      this.testVar = (await fetchClient.testfetch()).data;
      console.log(this.testVar);
    };
    func();
  }

}

