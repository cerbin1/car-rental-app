import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {map, tap} from "rxjs/operators";

interface CarDetails {
  name: string,
  pricePerDay: number,
  photo: string
}


export class Catalog {
  private http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http
  }

  all(): Observable<Object> {
    return this.http
      .get("/cars")
      .pipe(
        map(x => x),
        tap(x => console.log(x))
      )
  }

  getAll(): CarDetails[] {
    return [
      {
        'name': 'Maluch',
        'pricePerDay': 1,
        'photo': 'http://namasce.pl/wp-content/uploads/2018/01/maluch_v8_australia_3-702x336.jpg'
      },
      {
        'name': 'Saxu',
        'pricePerDay': 2,
        'photo': 'http://cloud.leparking.fr/2018/08/24/00/12/citroen-saxo-citroen-saxo-vts-1-6-16v-54-000-miles-fsh-loads-off-extras-bargain-bleu_6402278382.jpg'
      }]
  }
}
