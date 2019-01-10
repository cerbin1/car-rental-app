import {Component, OnInit} from '@angular/core';
import {Catalog} from "../car-catalog/catalog";

@Component({
  selector: 'app-car-list',
  templateUrl: './car-list.component.html',
  styleUrls: ['./car-list.component.scss']
})
export class CarListComponent implements OnInit {
  public cars = [];

  constructor() {
    this.cars = new Catalog().getAll();
  }

  ngOnInit() {
    this.catalog.all() // catalog dodac jako pole klasa Catalog
      .subscribe(x => {
        this.cars = x;
      })
  }
}
