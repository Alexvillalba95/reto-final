import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { FormOfferComponent } from './form-offer/form-offer.component';
=======
import { OfferListComponent } from './offers-list/offer-list/offer-list.component';
import { OffersListComponent } from './offers-list/offers-list.component';
<<<<<<< HEAD
>>>>>>> b449fbb8b225f37dfe231e047278cace68469d21
=======
import { OfferHomeComponent } from './offer-home/offer-home.component';
>>>>>>> 31751b63f927ccb29939d2f33d767db3f5270283

@NgModule({
  imports: [
    CommonModule
  ],
<<<<<<< HEAD
<<<<<<< HEAD
  declarations: [FormOfferComponent]
=======
  declarations: [OfferListComponent, OffersListComponent]
>>>>>>> b449fbb8b225f37dfe231e047278cace68469d21
=======
  declarations: [OfferListComponent, OffersListComponent, OfferHomeComponent]
>>>>>>> 31751b63f927ccb29939d2f33d767db3f5270283
})
export class OffersModule { }
