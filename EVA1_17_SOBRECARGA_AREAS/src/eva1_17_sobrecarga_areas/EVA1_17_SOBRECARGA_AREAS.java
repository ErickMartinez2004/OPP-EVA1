package eva1_17_sobrecarga_areas;

public class EVA1_17_SOBRECARGA_AREAS {

    public static void main(String[] args) {
        System.out.println("Area del circulo: " + area(5));
        System.out.println("Area del triangulo: " + area(5, 5));
        System.out.println("Area del trapecio: " + area(5, 5, 5));
    }

    public static double area(double radio) {
        return Math.PI * radio * radio;
    }

    public static double area(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static double area(double altura, double Base, double base) {
        return (altura) * (Base + base) / 2.0;
    }
}
