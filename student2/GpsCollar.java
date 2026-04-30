package student2;

public class GpsCollar extends Sensor {
    // Max and min coordinates are the same for x and y (square)
    int x; 
    int y;

    public GpsCollar(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
