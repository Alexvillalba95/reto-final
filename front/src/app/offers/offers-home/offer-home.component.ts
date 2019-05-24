import { Component, OnInit } from '@angular/core';
import { OffersService } from '../offers.service';

@Component({
  selector: 'app-offer-home',
  templateUrl: './offer-home.component.html',
  styleUrls: ['./offer-home.component.css']
})
export class OfferHomeComponent implements OnInit {

  constructor(private offerlist: OffersService) {

  }

  ngOnInit() {
  }

}
