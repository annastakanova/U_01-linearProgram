//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20a {
    public static void main(String[] args) {
        double l = 9.0;
        double r = l/2/Math.PI;
        double s = Math.PI * Math.pow(r, 2);
        System.out.println("площадь круга = " + s);
    }
}
