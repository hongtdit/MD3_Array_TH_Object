public class QuadraticEquation {
    private double a,b,c;



    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double getDiscriminant() {
        double delta = Math.pow(this.b,2) - 4*this.a*this.c;
        return delta;
    }

    public void  getRoot() {
        if (getDiscriminant()>0) {
            getRoot1();
            getRoot2();
        } else if (getDiscriminant()==0){
            System.out.println("PT có nghiệm kép:"+(-this.b)/(2*this.a));
        } else {
            System.out.println("PT vô nghiệm ");

        }
    }

    public  void getRoot1() {
        double r1 = (-this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
            System.out.println("Nghệm thứ 1 là: "+r1);

    }

    public  void getRoot2() {
        double r2 = (-this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
            System.out.println("Nghiệm thứ 2 là: "+r2);

    }


}
