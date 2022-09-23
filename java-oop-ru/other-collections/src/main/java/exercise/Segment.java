package exercise;

// BEGIN
public class Segment {
    public Point beginPoint;
    public Point endPoint;

    public Segment() {
    }

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Point beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public Point getMidPoint() {
        Integer midX;
        Integer midY;
        midX = (beginPoint.getX() + endPoint.getX())/2;
        midY = (beginPoint.getY() + endPoint.getY())/2;
        Point midPoint = new Point(midX, midY);
        return midPoint;
    }

    public static void main (String[] args) {
        Point point = new Point(4, 3);
        int x = point.getX(); // 4
        int y = point.getY(); // 3
        System.out.println("x = " + x + " y = " + y);

        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        midPoint.getX(); // 5
        midPoint.getY(); // 2
        System.out.println("midx = " + midPoint.getX() + " midy = " + midPoint.getY());
    }
}
// END
