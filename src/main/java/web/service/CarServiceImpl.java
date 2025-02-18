package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private Car car;

    private List<Car> cars;
    {
        cars = new ArrayList<Car>();
        cars.add(new Car("BMW", "X5", 1999));
        cars.add(new Car("Audi", "Q3", 2000));
        cars.add(new Car("Honda", "Civic", 1960));
        cars.add(new Car("Toyta", "Camry", 2023));
        cars.add(new Car("Lada", "kalina", 2005));
    }
    public List<Car> getCars(int a) {
        if (a==-1){
            return cars;
        } else return cars.stream().limit(a).collect(Collectors.toList());
    }
    public List<Car> getAllCars() {
        return cars;
    }

}