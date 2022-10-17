package web.service;

import web.model.Car;

import java.util.List;

public class CarServiseImpl implements CarService{

    @Override
    public List<Car> getCarsByCount(List<Car> carList, Integer count) {
        if (count >= 0 && count < 6) {
            return carList.subList(0, count);
        }
        return carList;
    }
}
