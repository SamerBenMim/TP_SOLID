package com.directi.training.srp.exercise;

public class CarManager
{

    carRepository carRepo = new carRepository();
    CarsFormatter CarsFormatter = new CarsFormatter();
    CarRater CarRater = new CarRater();

    public Car getFromDb(final String carId)
    { 
        return carRepo.getFromDb(carId);
    }

    public String getCarsNames()
    {
    return CarsFormatter.getCarsNames();
    }

    public Car getBestCar()
    {
        return  CarRater.getBestCar();
    }
}
