import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormOfferComponent } from './form-offer/form-offer.component';
import { OffersListComponent } from './offers-list/offers-list.component';
import { OfferHomeComponent } from './offers-home/offer-home.component';


@NgModule({
  imports: [
    CommonModule
  ],

  declarations: [FormOfferComponent, OffersListComponent, OfferHomeComponent]

})
export class OffersModule { }
