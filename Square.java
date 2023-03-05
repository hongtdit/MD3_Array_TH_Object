import java.util.Scanner;

public class Square {
        int canh;
    public Square() {
    }

    public Square(int canh) {
        this.canh = canh;

    }
    public int getArea() {
        return (this.canh * this.canh);
    }
    @Override
    public String toString() {
        return "Square{" +
                "canh=" + canh +
                '}';
    }

    }

