public class Hinh_Chu_Nhat {
    int width;
    int high;

    public Hinh_Chu_Nhat() {
    }

    public Hinh_Chu_Nhat(int width, int high) {
        this.width = width;
        this.high = high;
    }

    public int getArea() {
        return (this.width * this.high);
    }

    public int getPerimeter() {
        return (this.width+this.high)*2;
    }

    public String display () {
        return "Hình chữ nhật có {"+"độ dài ="+width+",độ rộng ="+ high+"}";
    }

    @Override
    public String toString() {
        return "Hinh_Chu_Nhat{" +
                "width=" + width +
                ", high=" + high +
                '}';
    }
}