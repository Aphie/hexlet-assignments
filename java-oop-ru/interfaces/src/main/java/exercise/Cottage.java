package exercise;

// BEGIN
public class Cottage implements Home{
    public Double area;
    public Integer floorCount;

    public void setArea(double area) {
        this.area = area;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public Cottage() {}

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
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
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }
}

// END
