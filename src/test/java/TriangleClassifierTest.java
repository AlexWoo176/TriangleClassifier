import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void equiangularTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;

        String expected = "tam giac deu";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void isoscelesTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;

        String expected = "tam giac can";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void scaleneTriangle() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void scaleneTriangle2() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void scaleneTriangle3() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void scaleneTriangle4() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.classifierTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

}