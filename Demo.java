import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        do {
            System.out.println("Nhập vào giá trị a: ");
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("Vui lòng nhập hệ số a khác 0");
            }
        }  while (a == 0);

        System.out.println("Nhập vào giá trị b: ");
        b = sc.nextDouble();
        System.out.println("Nhập vào giá trị c: ");
        c = sc.nextDouble();

        QuadraticEquation pt = new QuadraticEquation();
        pt.setA(a);
        pt.setB(b);
        pt.setC(c);

        pt.getRoot();
    }

    public static class StopWatchClass {
        private long startTime = 0, stopTime = 0;
        boolean running = false;

        public StopWatchClass() {
        }

        public void start() {
            this.startTime = System.nanoTime();
            this.running = true;
        }

        public void stop() {
            this.stopTime = System.nanoTime();
            this.running = false;
        }

        public long getElapsedTime() {
            long elapsed;
            if (running) {
                elapsed = (System.nanoTime() - startTime);
            } else {
                elapsed = (stopTime - startTime);
            }
            return elapsed;
        }


    }
}
