package com.directi.training.lsp.exercise;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        turnOn() ;
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
        turnOff();
    }

    @Override
    public void swim()
    {   turnOn() ;
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
        turnOff();
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
