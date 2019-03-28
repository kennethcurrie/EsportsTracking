import {TestReducer} from './testReducer';
import {TestAction} from '../actions/testAction';

interface ListenerCallback {
  // tslint:disable-next-line:callable-types
  (): void;
}

interface UnsubscribeCallback {
  // tslint:disable-next-line:callable-types
  (): void;
}

export class Store<T> {
  // tslint:disable-next-line:variable-name
  private _state: T;
  // tslint:disable-next-line:variable-name
  private _listeners: ListenerCallback[] = [];

  constructor(
    private reducer: TestReducer<T>,
    initialState: T
  ) {
    this._state = initialState;
  }

  getState(): T {
    return this._state;
  }

  dispatch(action: TestAction): void {
    this._state = this.reducer(this._state, action);
  }

  subscribe(listener: ListenerCallback): UnsubscribeCallback {
    this._listeners.push(listener);
    return () => { // returns an "unsubscribe" function
      this._listeners = this._listeners.filter(l => l !== listener);
    };
  }
}
