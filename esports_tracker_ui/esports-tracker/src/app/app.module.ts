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
  bootstrap: [AppComponent],
  exports: []
})
export class AppModule { }
