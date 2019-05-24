import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OfferListComponent } from './offers-list/offer-list/offer-list.component';
import { OffersListComponent } from './offers-list/offers-list.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [OfferListComponent, OffersListComponent]
})
export class OffersModule { }
