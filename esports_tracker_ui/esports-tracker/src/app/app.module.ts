import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestViewComponent } from './test-view/test-view.component';
import { SomeComponentComponent } from './some-component/some-component.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PageWrapperComponent } from './page-wrapper/page-wrapper.component';
import { HomeComponent } from './home/home.component';
import { NavComponent } from './nav/nav.component';


@NgModule({
  declarations: [
    AppComponent,
    TestViewComponent,
    SomeComponentComponent,
    NavbarComponent,
    PageWrapperComponent,
    HomeComponent,
    NavComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [PageWrapperComponent, HomeComponent, NavComponent]
})
export class AppModule { }
