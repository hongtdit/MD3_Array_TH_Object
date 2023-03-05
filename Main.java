import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chều dài HCN:");
        int width = sc.nextInt();
        System.out.println("nhập vào chều rộng HCN:");
        int high = sc.nextInt();
        Hinh_Chu_Nhat hcn = new Hinh_Chu_Nhat(width,high);
        System.out.println(hcn.display());
        System.out.println("Chu vi HCN là: "+hcn.getPerimeter()+"m");
        System.out.println("Diện tích HCN là: "+hcn.getArea()+"m2");
        Square hvuong = new Square(width);
        System.out.println(hvuong.getArea());
        System.out.println("Chu vi hvuong là: "+hvuong.getArea()+"m");

    }
}
