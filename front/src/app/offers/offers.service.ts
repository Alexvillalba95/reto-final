import { Injectable } from '@angular/core';
import {HttpErrorHandler, HandleError} from '../error.service';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import { Offer } from './offer';



@Injectable({
  providedIn: 'root'
})
export class OffersService {

  entity_url = environment.REST_API_URL + 'offers';

  private handlerError: HandleError;

  constructor(private http: HttpClient, private httpErrorHandler: HttpErrorHandler) {
    this.handlerError = httpErrorHandler.createHandleError('OwnerService');
  }

  getOffers(): Observable<Offer[]> {
    return this.http.get<Offer[]>(this.entity_url)
      .pipe(
        catchError(this.handlerError('getOffers', []))
      );
  }

  
  getOfferById(offer_id: string): Observable<Offer> {
    return this.http.get<Offer>(this.entity_url + '/' + offer_id)
      .pipe(
          catchError(this.handlerError('getOfferById', {} as Offer))
      );
  }

  addOffer(offer: Offer): Observable<Offer> {
    return this.http.post<Offer>(this.entity_url, offer)
      .pipe(
        catchError(this.handlerError('addOffer', offer))
      );
  }

  updateOffer(offer_id: string, offer: Offer): Observable<{}> {
    return this.http.put<Offer>(this.entity_url + '/' + offer_id, offer)
      .pipe(
        catchError(this.handlerError('updateOffer', offer))
      );
  }

  deleteOffer(offer_id: string): Observable<{}> {
    return this.http.delete<Offer>(this.entity_url + '/' + offer_id)
      .pipe(
         catchError(this.handlerError('deleteOffer', [offer_id]))
      );
  }

  getOffersValid(): Observable<Offer[]> {
    return this.http.get<Offer[]>(this.entity_url+ '/valid')
      .pipe(
        catchError(this.handlerError('getOffersValid', []))
      );
  }


}
