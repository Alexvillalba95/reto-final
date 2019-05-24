import { Injectable } from '@angular/core';
import {HttpErrorHandler, HandleError} from '../error.service';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {catchError} from 'rxjs/operators';
import {HttpClient} from '@angular/common/http';
import { Owner } from 'app/owners/owner';



@Injectable({
  providedIn: 'root'
})
export class OffersService {

  entity_url = environment.REST_API_URL + 'offers';

  private handlerError: HandleError;

  constructor(private http: HttpClient, private httpErrorHandler: HttpErrorHandler) {
    this.handlerError = httpErrorHandler.createHandleError('OwnerService');
  }
  
  getOffers(): Observable<Owner[]> {
    return this.http.get<Owner[]>(this.entity_url)
      .pipe(
        catchError(this.handlerError('getOwners', []))
      );
  }
}
