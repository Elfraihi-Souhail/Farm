package student2;

import student1.GeographicalZone;

public abstract class Sensor {
    int id;
    static int incID = 0; // For auto incrementing ID
    GeographicalZone zone;
    SensorStatus status;
    double min;
    double max;
    Reading reading;
    
}
