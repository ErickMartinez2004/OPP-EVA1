package eva1_5_circulo;

public class Circulo {
    //atributos 

    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double rad, double zona, double redonda) {
        radio = rad;
        area = zona;
        perimetro = redonda;

    }

    public Circulo() {
        radio = 0;
        area = 0;
        perimetro = 0;

    }

    public double getRadioa() {
        return area;
    }

    public void setRadioa(double valor) {
        radio = valor;
        valor = area;
        area = Math.pow(radio, 2) * Math.PI;
        System.out.println("Area es: " + area);
    }

    public double getRadiop() {
        return radio;
    }

    public void setRadiop(double valor) {
        radio = valor;
        valor = perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro es: " + perimetro);

    }

    public void calcularArea() {
        area = Math.pow(radio, 2) * Math.PI;
        System.out.println("El area del circulo es: " + area);
    }

    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }
}

