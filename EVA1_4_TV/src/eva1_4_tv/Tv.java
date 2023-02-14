package eva1_4_tv;

public class Tv {

    private int vol;
    private int canal;
    private boolean poder;

    //constructores
    public Tv() {//constructor default 
        vol = 0;
        canal = 100;
        poder = false;//apagado 
    }

    //métodos para operar la TV (interfaz) 
    //encender y apagar la TV
    public void cambiarEstadoPoder() {
        //verficar el estado de la TV
        if (poder == true) {
            poder = false;
            System.out.println("Apagando pantalla");
        } else {
            poder = true;
            System.out.println("Encendiendo pantalla");
        }
    }

    //volumen 
    public void subirVolumen() {
        if (poder == true) {//if(poder)la tv esta prendida 
            //no debemos de pasarnos de 100
            if (vol < 100) {
                vol = vol + 1;//acumulador
                //vol++;
                //vol+=1
                System.out.println("Volumen: " + vol);
            }

        }
    }

    public void bajarVolumen() {
        if (poder == true) {//if(poder)
            if (vol > 0) {
                vol = vol - 1;//acumulador
                //vol--;
                //vol-=1
                System.out.println("Volumen: " + vol);
            }

        }
    }

    public void subirCanal() {
        if (poder == true) {
            canal = canal + 1;
            if (canal > 100) {
                canal = 0;

            }
            System.out.println("canal: " + canal);
        }

    }

    public void bajarCanal() {
        if (poder = true) {
            canal = canal - 1;
            if (canal < 0) {
                canal = 100;

            }
            System.out.println("canal: " + canal);
        }

    }

}
