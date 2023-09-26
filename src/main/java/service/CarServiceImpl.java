package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = new ArrayList<>();

    public CarServiceImpl(){
        carList.add(new Car("Toyota", "White", 2018));
        carList.add(new Car("Honda", "Silver", 2022));
        carList.add(new Car("Subaru", "Yellow", 2015));
        carList.add(new Car("Lexus", "White", 2023));
        carList.add(new Car("Lada", "Black", 2006));

    }

    @Override
    public final List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
