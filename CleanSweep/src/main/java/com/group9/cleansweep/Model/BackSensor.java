package com.group9.cleansweep.Model;

import com.group9.cleansweep.Model.ObstacleDetection;

public class BackSensor {

    public ObstacleDetection.ObstacleType run() {
        ObstacleDetection obstacle = new ObstacleDetection();
        return obstacle.isObstacleDetected;
    }
}
