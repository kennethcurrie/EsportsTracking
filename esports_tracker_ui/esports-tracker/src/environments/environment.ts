// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

/*
export const environment = {
  production: false
};

*/

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.

const dev = {
  awsRegion:          'us-east-1',
  cognitoClientId:    '4mafdnad6u1o1ugokulsmbrl96',
  cognitoUserPoolId:  'us-east-1_6hCFlGZHZ',
  smsContext:         'http://10.226.83.143:8092/',
  production: false
};

const uat = {
  awsRegion:          'us-east-1',
  cognitoClientId:    '4mafdnad6u1o1ugokulsmbrl96',
  cognitoUserPoolId:  'us-east-1_6hCFlGZHZ',
  mgtContext:         'http://localhost:8090',
  smsContext:         'https://7i6rudc3m2.execute-api.us-east-1.amazonaws.com/uat',
  surveyContext:      'NEEDTOADD',
  production: false
};

const prod = {
  awsRegion:          'us-east-1',
  cognitoClientId:    'n09bpbndlp78jrbv6rbar4d13',
  cognitoUserPoolId:  'us-east-1_xavxFp1nr',
  mgtContext:         'http://localhost:8090',
  smsContext:         'https://7i6rudc3m2.execute-api.us-east-1.amazonaws.com/prod',
  surveyContext:      'NEEDTOADD', // NEED TO ADD EC2 ADDRESS
  production: false
};


export let environment = dev;


