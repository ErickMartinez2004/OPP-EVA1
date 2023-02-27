/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga_rfc;

/**
 *
 * @author jesus
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        String rfc= generarRFC("ERICK","MARTINEZ","MARTINEZ",2004,10,01);
        System.out.println(rfc);
    }
    
    public static String generarRFC(String nombre, String apPat, String apMat, int año,int mes, int dia){
       String aP1 = apPat.charAt(0) + ""; 
       String aP2 = apPat.charAt(1) + "";
       String apM = apMat.charAt(0) + "";
       String nom = nombre.charAt(0) + "";
       String rfc = aP1+ aP2 + apM + nom + año + mes + dia + "";
       return rfc;
    }
    //SOBRECARGAR PARA LOS CASOS:
    //FALTE APELLIDO UN APELLIDO-----> SUSTITUIR POR X
    //FALTEN AMBOS APELLIDOS -----> SUSTITUIR POR XX
       public static String generarRFC(String nombre, String apMat, int año,int mes, int dia){
       String apM = apMat.charAt(0) + "";
       String nom = nombre.charAt(0) + "";
       String rfc = "X" + apM + nom + año + mes + dia + "";
       return rfc;
    
}
      
}