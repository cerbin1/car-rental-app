package pl.bartek.rentalapp.carcatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/cars")
    List<Car> list() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("1", "Maluch ekstra", "Fiat", 1, "Biedacki", 1980));
        return cars;
//        return                carRepository.findAll();
    }

    @PostMapping("/cars")
    void create(@RequestBody Car car) {
        carRepository.save(car);
    }

    @GetMapping("/cars/{id}")
    Car detalis(@PathVariable String id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no such car"));
    }

    @DeleteMapping("/cars/{id}")
    void delete(@PathVariable String id) {
        carRepository.deleteById(id);
    }

    @PutMapping("/cars/{id}")
    void update(@PathVariable String id, @RequestBody Car car) {
        Car loaded = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("no such car"));

        loaded.setCapacity(car.getCapacity());
        loaded.setModel(car.getModel());
        loaded.setYearOfManufacture(car.getYearOfManufacture());
        loaded.setSegment(car.getSegment());
        loaded.setName(car.getName());

        carRepository.save(loaded);
    }
}
