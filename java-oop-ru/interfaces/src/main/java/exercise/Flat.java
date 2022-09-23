package exercise;

// BEGIN
public class Flat implements Home{
    public Double area;
    public Double balconyArea;
    public Integer floor;

    public void setArea(double area) {
        this.area = area;
    }

    public void setBalconyArea(double balconyArea) {
        this.balconyArea = balconyArea;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public Flat() {
    }

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area+balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        int comparisonResult;
        if (getArea() > another.getArea()) {
            comparisonResult = 1;
        } else if (getArea() < another.getArea()) {
            comparisonResult = -1;
        } else {
            comparisonResult = 0;
        }
        return comparisonResult;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor() + " этаже";
    }
}
// END
