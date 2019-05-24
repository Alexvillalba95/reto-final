import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { FormOfferComponent } from './form-offer/form-offer.component';
=======
import { OfferListComponent } from './offers-list/offer-list/offer-list.component';
import { OffersListComponent } from './offers-list/offers-list.component';
>>>>>>> b449fbb8b225f37dfe231e047278cace68469d21

@NgModule({
  imports: [
    CommonModule
  ],
<<<<<<< HEAD
  declarations: [FormOfferComponent]
=======
  declarations: [OfferListComponent, OffersListComponent]
>>>>>>> b449fbb8b225f37dfe231e047278cace68469d21
})
export class OffersModule { }
