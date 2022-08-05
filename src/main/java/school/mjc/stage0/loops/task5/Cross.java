package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength % 2 != 0 && sideLength > 0) {
            for (int y = 1; y <= sideLength; y++) {

                if (y != sideLength / 2 + sideLength % 2) {
                    for (int i = 1; i <= sideLength; i++) { // simple line start <-
                        if (i != sideLength / 2 + sideLength % 2)
                            System.out.print(" ");
                        else System.out.print(8);

                    }
                    System.out.println();// end of simple line <-
                }
                else {
                    for (int i = 1; i <= sideLength ; i++) {
                        System.out.print(8);
                    }
                    System.out.println();
                }
            }
        }
        else System.out.print("");

    }
}
