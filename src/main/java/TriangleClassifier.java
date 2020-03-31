public class TriangleClassifier {
    public static String classifierTriangle (int sideA, int sideB, int sideC) {
//        throw new ExceptionInInitializerError();
        boolean sideAequalsideB = sideA == sideB;
        boolean sideBequalsideC = sideB == sideC;
        boolean sideAequalsideC = sideA == sideC;
        int sumAB = sideA + sideB;
        int sumAC = sideA + sideC;
        int sumBC = sideB + sideC;
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideAequalsideB && sideAequalsideC) {
                return "tam giac deu";
            } else if (sideAequalsideB || sideAequalsideC || sideBequalsideC) {
                return "tam giac can";
            } else if (sumAB < sideC || sumAC < sideB || sumBC < sideA) {
                return "khong phai tam giac";
            }
            return "tam giac thuong";
        } else {
            return "khong phai tam giac";
        }
    }
}
