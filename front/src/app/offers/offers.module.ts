import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormOfferComponent } from './form-offer/form-offer.component';
import { OffersListComponent } from './offers-list/offers-list.component';
import { OfferHomeComponent } from './offers-home/offer-home.component';
import { OffersRoutingModule } from './offers-routing.module';
import { FormsModule } from '@angular/forms';
import { OffersService } from './offers.service';


@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    OffersRoutingModule,
  ],

  declarations: [
    FormOfferComponent,
    OffersListComponent,
    OfferHomeComponent
  ],
  providers: [
    OffersService
  ]

})
export class OffersModule { }
