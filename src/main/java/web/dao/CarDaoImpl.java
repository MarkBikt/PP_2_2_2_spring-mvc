package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Mazda", 6, "Red"));
        carList.add(new Car("Audi", 100, "Black"));
        carList.add(new Car("Lada", 9, "Grey"));
        carList.add(new Car("Lada", 7, "Blue"));
        carList.add(new Car("Toyota", 4, "Silver"));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}