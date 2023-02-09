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
public class Persona {

    // ATRIBUTOS DE LA CLASE 
    private String nombre;
    private String apellido;
    private int edad;
    private boolean edoCivil;

    // METODOS: COMPORTAMIENTO
    // lectura y escritura de atributos:
    //Métodos get --> leer, método set --> escribir
    // metodos:
    // modificdor de valor de retorno nombre (argumentos)(impementacion)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public boolean getEdoCivil() {
        return edoCivil;
    }

    public void setEdoCivil(boolean valor) {
        edoCivil = valor;
    }

    public void ImprimirDatos() {
        System.out.println("Datos Almacenados: ");
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        if (edoCivil) {
            System.out.println("Estado Civil: Casado");
        } else {
            System.out.println("Estado Civil: Soltero");
        }
    }
}
