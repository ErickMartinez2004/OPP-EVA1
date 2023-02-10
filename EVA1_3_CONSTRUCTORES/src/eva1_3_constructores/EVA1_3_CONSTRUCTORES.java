/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author invitado
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("2", 40000000, "Carlos slim");
        /*cuenta1.setNumCuenta("5");
         cuenta1.setNombre("Carlos slim");
         cuenta1.setSaldo(40000000);*/

        System.out.println("DATOS DEL CLIENTE: ");
        String nombre = cuenta1.getNombre();
        System.out.println(nombre);
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        //--------------------------------------------
        CuentaBancaria cuenta2 = new CuentaBancaria("6", 100000, "Erick Martinez");
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta2.getNombre());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());

        //--------------------------------------------
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta3.getNombre());
        System.out.println(cuenta3.getNumCuenta());
        System.out.println(cuenta3.getSaldo());
    }

}
