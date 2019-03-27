import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TestViewComponent } from './test-view/test-view.component';

const routes: Routes = [
  { path: 'test', component: TestViewComponent },
  // { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { enableTracing: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
