package test;

import Junit5.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getType() {
        assertAll("test",
                () -> assertEquals(3, Triangle.getType(2,2,2),"是个三角形"),
                () -> assertEquals(1,Triangle.getType(3,4,5),"是个三角形"),
                () -> assertEquals(2,Triangle.getType(2,3,3),"是个三角形"),
                () -> assertEquals(0,Triangle.getType(1,1,5),"是个三角形")
                );
    }
}