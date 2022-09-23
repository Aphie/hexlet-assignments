package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import exercise.geometry.Point;
import exercise.geometry.Segment;

class AppTest {
    @Test
    void testPoint() {
        double[] point1 = Point.makePoint(4, 5);
        assertThat(Point.getX(point1)).isEqualTo(4);
        assertThat(Point.getY(point1)).isEqualTo(5);
    }

    @Test
    void testSegment() {
        double[] point1 = Point.makePoint(3, 2);
        double[] point2 = Point.makePoint(0, 1);
        var segment = Segment.makeSegment(point1, point2);
        assertThat(Segment.getBeginPoint(segment)).isEqualTo(point1);
        assertThat(Segment.getEndPoint(segment)).isEqualTo(point2);
    }

    @Test
    void testGetMidpointOfSegment() {
        var segment1 = Segment.makeSegment(Point.makePoint(3, 2), Point.makePoint(0, 0));
        var expected1 = Point.makePoint(1.5, 1);
        assertThat(App.getMidpointOfSegment(segment1)).isEqualTo(expected1);

        var segment2 = Segment.makeSegment(Point.makePoint(3, 2), Point.makePoint(2, 3));
        var expected2 = Point.makePoint(2.5, 2.5);
        assertThat(App.getMidpointOfSegment(segment2)).isEqualTo(expected2);
    }

    @Test
    void testReverse() {
        double[] point1 = Point.makePoint(4, 5);
        double[] point2 = Point.makePoint(2, 8);
        var segment = Segment.makeSegment(point1, point2);
        var reversedSegment = App.reverse(segment);

        assertThat(Segment.getBeginPoint(reversedSegment))
            .isEqualTo(point2)
            .isNotSameAs(point2);

        assertThat(Segment.getEndPoint(reversedSegment))
            .isEqualTo(point1)
            .isNotSameAs(point1);
    }

    // BEGIN
    
    // END
}
