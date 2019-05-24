import { Component, OnInit } from '@angular/core';
import { Offer } from '../offer';
import { OffersService } from '../offers.service';

@Component({
  selector: 'app-form-offer',
  templateUrl: './form-offer.component.html',
  styleUrls: ['./form-offer.component.css']
})
export class FormOfferComponent implements OnInit {

  private offer: Offer;

  constructor(private service: OffersService) { }

  ngOnInit() {
  }

  onSubmit(offer: Offer) {
    offer.id = null;
    this.service.addOffer(offer).subscribe(
      new_offer => {
        this.offer = new_offer;
      },
    );
  }

}
