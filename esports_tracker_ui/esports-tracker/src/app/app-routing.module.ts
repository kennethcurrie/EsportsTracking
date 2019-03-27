import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SomeComponentComponent } from './some-component/some-component.component';
import { TestViewComponent } from './test-view/test-view.component';

const routes: Routes = [
  { path: 'some', component: SomeComponentComponent },
  { path: 'test', component: TestViewComponent },
  
  // { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
