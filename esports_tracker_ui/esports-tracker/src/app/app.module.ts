import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestViewComponent } from './test-view/test-view.component';
import { SomeComponentComponent } from './some-component/some-component.component';


@NgModule({
  declarations: [
    AppComponent,
    TestViewComponent,
    SomeComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
<<<<<<< HEAD
  bootstrap: [AppComponent],
=======
  bootstrap: [AppComponent, TestViewComponent, SomeComponentComponent],
>>>>>>> 1ea2648eb7bcf6c9e2e4072d800df9a62924b591
  exports: []
})
export class AppModule { }
