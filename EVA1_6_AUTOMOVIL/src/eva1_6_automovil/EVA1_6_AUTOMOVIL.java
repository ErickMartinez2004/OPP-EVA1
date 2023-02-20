package eva1_6_automovil;

public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        Automovil carro1 = new Automovil("FORD", "F-150", "Hola-23-55", 2016, "Erick Martinez");
        carro1.imprimirDatos();
        carro1.setAño(2010);
        carro1.imprimirDatos();
    }

}
