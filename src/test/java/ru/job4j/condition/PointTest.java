package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void whenPoint00toPoint20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint01toPoint02then1() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double expected = 1;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint03toPoint32then3dot16() {
        Point a = new Point(0, 3);
        Point b = new Point(3, 2);
        double expected = 3.16;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint30toPoint35then5() {
        Point a = new Point(3, 0);
        Point b = new Point(3, 5);
        double expected = 5;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint004toPoint090then8Dot94() {
        Point a = new Point(0, 8, 0);
        Point b = new Point(0, 0, 4);
        double expected = 8.94;
        double out = a.distance3d(b);
        assertThat(out).isCloseTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoint034toPoint645then6Dot16() {
        Point a = new Point(0, 3, 4);
        Point b = new Point(6, 4, 5);
        double expected = 6.16;
        double out = a.distance3d(b);
        assertThat(out).isCloseTo(expected, withPrecision(0.01));
    }
}