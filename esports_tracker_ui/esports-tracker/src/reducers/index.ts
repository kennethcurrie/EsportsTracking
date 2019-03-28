import {TestAction} from '../actions/TestAction';

// 3-28-19
// our reducer right now is a function that takes in
// an action
// and a state of type T
// it returns an object of type T
// T is just a generic type parameter,
// you can use L, K, whatever apart from T
type testReducer<T> = (state: T, action: TestAction) => T;

// create an instance of our reducer
const testReducer: testReducer<number> = (state: number, action: TestAction) => {
  if (action.type === 'INCREMENT') {
    return state + 1;
  }
  if (action.type === 'DECREMENT') {
    return state - 1;
  }
  return state;
};

// export our reducer
export interface TestReducer {
  testReducer: testReducer<number>;
}
