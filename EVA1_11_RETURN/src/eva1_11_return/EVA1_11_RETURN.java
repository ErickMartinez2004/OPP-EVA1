
package eva1_11_return;


public class EVA1_11_RETURN {

    
    public static void main(String[] args) {
        int resu = square(10);//invocación o llamada a función
        System.out.println("Resultado: " + resu );
    }
    public static int square(int num){
      return  num * num;
    }
}
