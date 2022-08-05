package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        int y;
        if (sideLength > 2) {

            //вертикальный переход + вертикальный вывод
            for (y = 1; y <= sideLength; y++) {
                // условие выбора строки
                if (y > 1 && y < sideLength) {
                    for (int i = 1; i <= sideLength; i++) {
                        if (i > 1 && i < sideLength) {
                            System.out.print(" "); // вывод пустой строки
                        } else System.out.print(8);
                    }
                } else {
                    for (int x = 1; x <= sideLength; x++) { // вывод полной строки
                        System.out.print(8);
                    }
                }
                System.out.println();
            }
        }
        else if (sideLength == 2) {
            System.out.println(88);
            System.out.println(88);
        }
        else System.out.print("");
    }
}
