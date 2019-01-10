package pl.bartek.rentalapp.carcatalog;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
    @Id
    private String id;
    private String name;
    private String model;
    private Integer capacity;
    private String segment;
    private Integer yearOfManufacture;
}
