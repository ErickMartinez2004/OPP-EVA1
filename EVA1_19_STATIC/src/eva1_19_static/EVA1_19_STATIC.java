/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;


public class EVA1_19_STATIC {

   
    public static void main(String[] args) {
        //Static: algo que podemos usar sin crear instancias 
      
        System.out.println("PI" + Math.PI);
        System.out.println("Número aleatorio: " + Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        Saludo2();//SI NO ES ESTATICO, Y NO SE A CREADO 
                  //UN OBJETO, EL MÉTODO NO EXISTE
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
}
    class Utilerias {
        // ESTE MÉTODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE 
      //CALSE. SOLO SE USA A TRAVÉS DE UN OBJETO.
        public void Saludo(){
            System.out.println("Hola!!");
        }
        //otroSaludo(): ESTE METODO EXISTE EN EL MOMENTO QUE EN EL PROYECTO
        //INICIA SU EJECUCION. NO NECESITA QUE SE CREE UN OBJETO DE 
        //CLASE PARA PODER UTILIZAR. SE USA A TRAVÉS DE LA CLASE.
        public static void otroSaludo(){
            System.out.println("Otro saludo (static)");
        }
        
    }
   

