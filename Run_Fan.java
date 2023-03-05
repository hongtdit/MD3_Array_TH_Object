public class Run_Fan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setSpeed(3);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        System.out.println(f1);
    }
}
