export interface TestAction {
  type: string;
  payload?: any;
}

const testIncrementAction: TestAction = { type: 'INCREMENT' };
const testDecrementAction: TestAction = { type: 'DECREMENT' };
const testPlusSevenAction = { type: 'PLUS', payload: 7 };
