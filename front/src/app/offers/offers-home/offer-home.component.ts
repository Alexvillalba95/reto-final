import { Component, OnInit } from '@angular/core';
import { Offer } from '../offer';
import { OffersService } from '../offers.service';

@Component({
  selector: 'app-offer-home',
  templateUrl: './offer-home.component.html',
  styleUrls: ['./offer-home.component.css']
})
export class OfferHomeComponent implements OnInit {

  private Ofertas : Array<Offer>;
  constructor(private service : OffersService) {
      this.Ofertas = [];
  }

  ngOnInit() {
    this.service.getOffersValid().subscribe(resp => {this.Ofertas = resp;});
  }

}
