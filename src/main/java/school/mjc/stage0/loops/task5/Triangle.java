package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength > 1) {
            //вертикальный переход + вертикальный вывод
            for (int y = 1; y <= cathetusLength; y++) {
                for (int i = 1; i <= y; i++) {
                    System.out.print(8);
                }
                System.out.println(); // разделитель

            }
        }
        else System.out.print("");

    }
}
