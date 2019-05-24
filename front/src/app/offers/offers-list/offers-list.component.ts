import { Component, OnInit } from '@angular/core';
import { Offer } from '../offer';
import { OffersService } from '../offers.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-offers-list',
  templateUrl: './offers-list.component.html',
  styleUrls: ['./offers-list.component.css']
})
export class OffersListComponent implements OnInit {
  errorMessage: string;
  offers: Offer[];

  constructor(private router: Router, private offerservice: OffersService) { }

  ngOnInit() {

    this.offerservice.getOffers().subscribe(
      offers => this.offers = offers,
      error => this.errorMessage = <any> error);

  }
  

  addOffer(){
    this.router.navigate(['/offers/add']);
  }

}
