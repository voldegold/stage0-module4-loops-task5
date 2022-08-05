package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        // odd
        if (height % 2 != 0) {
            // vertical movement cycle
            for (int y = 1; y <= height; y++) {
                // line choose condition
                if (y == 1) {
                    // full line
                    for (int i = 1; i <= height ; i++) {
                        System.out.print("8");
                    }
                    System.out.println();
                } else if (y == height) {
                    // full line
                    for (int i = 1; i <= height ; i++) {
                        System.out.print("8");
                    }
                    System.out.print("\n");
                } else if (y == height / 2 + height % 2) {
                    // middle for odd
                    for (int j = 1; j < height; j++) {
                        if (j == height / 2 + height % 2) {
                            System.out.print("8");
                        }
                        System.out.print(" ");
                    }
                    System.out.println();
                } else {
                    // filler line
                    for (int n = 1; n <= height; n++) {
                        if (n == 1 || n == height) {

                            System.out.print(" ");
                        } else System.out.print(8);

                    }
                    System.out.println();
                }
            }

        }
        //even
        else {
            // vertical movement cycle
            for (int y = 1; y <= height; y++) {
                // line choose condition
                if (y == 1 || y == height) {
                    // full line
                    for (int i = 1; i <= height ; i++) {
                        System.out.print(8);
                    }
                    System.out.println();

                } else if (y == height / 2 || y == (height / 2) + 1) {
                    // middle line
                    for (int j = 1; j <= height; j++) {
                        if (j == (height / 2) || j == (height / 2) + 1 ) {
                            System.out.print(8);
                        }
                        else System.out.print(" ");
                    }
                    System.out.println();

                } else {
                    // filler line
                    for (int n = 1; n <= height; n++) {
                        if (n == 1 || n == height) {

                            System.out.print(" ");
                        }
                        else System.out.print(8);

                    }
                    System.out.println();

                }
            }
        }

    }
}
