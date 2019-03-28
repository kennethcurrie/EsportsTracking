import { Component, OnInit } from '@angular/core';
import {store} from '../app.component';
@Component({
  selector: 'app-some-component',
  templateUrl: './some-component.component.html',
  styleUrls: ['./some-component.component.scss']
})

export class SomeComponentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    // subscribe to the store
    const unsubscribe = store.subscribe(() => {
      console.log('subscribed: ', store.getState());
    });

    store.dispatch({ type: 'INCREMENT' }); // -> subscribed: 1
    store.dispatch({ type: 'INCREMENT' }); // -> subscribed: 2

    alert(store.getState());
  }

}
