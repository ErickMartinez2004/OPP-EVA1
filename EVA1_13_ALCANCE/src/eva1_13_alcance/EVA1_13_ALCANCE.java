/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_alcance;

/**
 *
 * @author jesus
 */
public class EVA1_13_ALCANCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 100;

        for (int i = 0; i < 10; i++) {//inicio del ciclo for
            System.out.println("x = " + x);//visible dentro del for 
            System.out.println("i = " + i);
            System.out.println(" j = " + j);//variable no visible 
            //no esta declarada
            int j = 100;//apartir de aqui es visible 
            System.out.println("j = " + j);
            {
                int z = 1000;
                System.out.println("z = " + z);
            }
            System.out.println("z = " + z);
        }//termina el bucle for 

        //no estándeclaradas las variables 
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }

    public static void algo() {

    }

}
