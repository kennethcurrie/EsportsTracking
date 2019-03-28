import { Component, OnInit } from '@angular/core';
import {fetchClient} from '../../axios/sms-clients/fetch-client';
@Component({
  selector: 'app-some-component',
  templateUrl: './some-component.component.html',
  styleUrls: ['./some-component.component.sass']
})
export class SomeComponentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    alert('Hello World');
    alert(JSON.stringify(fetchClient.testfetch()));
  }

}
