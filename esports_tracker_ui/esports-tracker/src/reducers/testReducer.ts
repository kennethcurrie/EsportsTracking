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
// watch the const
const testReducer: testReducer<number> = (state: number, action: TestAction) => {
  switch (action.type) {
    case 'INCREMENT':
      return state + 1;
    case 'DECREMENT':
      return state - 1;
    case 'PLUS':
      return state + action.payload;
    default:
      return state;
    }
};

// export our reducer
export interface TestReducer {
  testReducer: testReducer<number>;
}
