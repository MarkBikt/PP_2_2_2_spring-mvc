package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mazda", 6, "Red"));
        carList.add(new Car("Audi", 100, "Black"));
        carList.add(new Car("Lada", 9, "Grey"));
        carList.add(new Car("Lada", 7, "Blue"));
        carList.add(new Car("Toyota", 4, "Silver"));
        CarService carService = new CarServiseImpl();
        carList = carService.getCarsByCount(carList, count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
//1. Создайте еще один контроллер, замаппленный на /cars.
//2. Создайте модель Car с тремя произвольными полями.
//3. Создайте список из 5 машин.
//4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
//5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
//6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
//при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
