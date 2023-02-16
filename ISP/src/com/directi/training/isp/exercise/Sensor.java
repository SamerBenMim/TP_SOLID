package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor 
{
    public void register(ISensingObject sensorClientDoor )
    {
        while (true) {
            if (isPersonClose()) {
                sensorClientDoor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
