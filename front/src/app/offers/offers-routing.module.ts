
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OffersListComponent } from './offers-list/offers-list.component';
import { FormOfferComponent } from './form-offer/form-offer.component';
import { OfferHomeComponent } from './offers-home/offer-home.component';

const offerRoutes: Routes = [
  { path: 'offers', component: OfferHomeComponent },
  { path: 'offers/add', component: FormOfferComponent },
  { path: 'offers/list', component: OffersListComponent }

];

@NgModule({
  imports: [RouterModule.forChild(offerRoutes)],
  exports: [RouterModule]
})

export class OffersRoutingModule {
}
