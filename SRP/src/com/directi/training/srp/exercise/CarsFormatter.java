package com.directi.training.srp.exercise;


public class CarsFormatter {
    public  String getCarsNames(){
        carRepository carRepo = new carRepository();
        StringBuilder sb = new StringBuilder();
        for (Car car : carRepo.getCarsList()) {
            sb.append(car.getName());
            
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
