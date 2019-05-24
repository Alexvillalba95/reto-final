import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { OfferListComponent } from './offers-list/offer-list/offer-list.component';
import { OffersListComponent } from './offers-list/offers-list.component';
import { OfferHomeComponent } from './offer-home/offer-home.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [OfferListComponent, OffersListComponent, OfferHomeComponent]
})
export class OffersModule { }
