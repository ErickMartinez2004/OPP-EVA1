/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CLASE ES LA RECETA:
        // OBJETO ES PLATILLO
        // INSTANCIACIÓN:
        // 1. Declarar la identificador para el objeto
        // 2. Asignar memoria con new 
        // 3. Invocar su constructor 
        // Persona() --> constructor;
        // constructor --> método
        Persona perso1 = new Persona();
        // System.out.println(perso1);
        /*
        // ESTA SECCION 
        perso1.nombre = "Eick";
        perso1.apellido = "Martinez";
        perso1.edad = 18;
        perso1.edoCivil = false; //true es casado 
        
        System.out.println(perso1.nombre);*/
        perso1.setNombre("Erick Alejandro");
        perso1.setApellido("Martinez Martinez");
        perso1.setEdad(18);
        perso1.setEdoCivil(false);
        /*System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        System.out.println(perso1.getEdoCivil());*/

        perso1.ImprimirDatos();

        //PERSONA 2
        Persona perso2 = new Persona();
        perso2.setNombre("Pedro");
        perso2.setApellido("Soto Ruiz");
        perso2.setEdad(50);
        perso2.setEdoCivil(true);

        perso2.ImprimirDatos();
    }
    
}
