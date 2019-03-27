import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SomeComponentComponent } from './some-component/some-component.component';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule, SomeComponentComponent],
  declarations: [SomeComponentComponent]
})
export class AppRoutingModule { }
