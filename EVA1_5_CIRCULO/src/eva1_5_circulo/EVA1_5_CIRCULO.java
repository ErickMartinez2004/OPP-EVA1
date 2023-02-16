package eva1_5_circulo;

public class EVA1_5_CIRCULO {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(50, 0, 0);
        /*circulo1.setRadioa(3);//calcular area 
        circulo1.setRadiop(3);// calcular perimetro*/

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

    }

}
