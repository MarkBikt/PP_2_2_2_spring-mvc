package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiseImpl implements CarService{


    private CarDao carDao;
    @Autowired
    public CarServiseImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        if (count >= 0 && count < 6) {
            return carDao.getCars().subList(0, count);
        }
        return carDao.getCars();
    }
}
