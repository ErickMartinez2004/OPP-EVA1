package eva1_12_califas;

public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        String cali;
        cali = calif(85);
        System.out.println("Califa para 85: " + cali);//almaceno el resultado en una variable 
        System.out.println("Califa para 70: " + calif(70));//invoco dentro de otra función
        calif(100);//ignoro el resultado 
    }

    public static String calif(int calif) {
        /*if((calif>=91)&&(calif<=100)){
            return "A";
        }else if ((calif>=81)&&(calif<=90)){
            return "B";
        }else if ((calif>=71)&&(calif<=80)){
            return "C";
        }else {
            return "D";
        }*/
        String resu = "";
        if ((calif >= 91) && (calif <= 100)) {
            resu = "A";
        } else if ((calif >= 81) && (calif <= 90)) {
            resu = "B";
        } else if ((calif >= 71) && (calif <= 80)) {
            resu = "C";
        } else {
            resu = "D";
        }
        return resu;
    }
}

