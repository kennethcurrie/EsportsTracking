import { Component } from '@angular/core';
import { Store } from '../reducers';
import { reducer } from '../reducers/testReducer';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'esports-tracker';
}

// pass our testReducer into our store
// this is the single store (and reducer) that all components will use
// combineReducers to add more reducers
// tslint:disable-next-line:align
export const store = new Store<number>(reducer, 0);
