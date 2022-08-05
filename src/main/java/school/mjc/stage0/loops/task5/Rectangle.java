package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int y;
        if (height > 2) {

            //вертикальный переход + вертикальный вывод
            for (y = 1; y <= height; y++) {
                // условие выбора строки
                if (y > 1 && y < height) {
                    for (int i = 1; i <= length; i++) {
                        if (i > 1 && i < length) {
                            System.out.print(" "); // вывод пустой строки
                        } else System.out.print(8);
                    }
                } else {
                    for (int x = 1; x <= length; x++) { // вывод полной строки
                        System.out.print(8);
                    }
                }
                System.out.println();
            }
        }
        else if (height == 2) {
            for (int x = 1; x <= length; x++) { // вывод полной строки
                System.out.print(8);
            }
        }
        else System.out.print("");
    }
}
