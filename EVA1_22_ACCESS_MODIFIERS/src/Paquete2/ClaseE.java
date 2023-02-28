package Paquete2;

import Paquete1.ClaseA;
import Paquete1.ClaseC;

public class ClaseE {

    public int publicE;
    int defaultE;
    private int privateE;

    public void prueba() {
        ClaseA objA = new ClaseA();
        //objA.publicA;

        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles 

        //ClaseB es invisible por ser clase default 
        // y esta en otro paquete 
        //ClaseB objB = new ClaseB();
        //ClaseD es invisible por ser clase default 
        // y esta en otro paquete 
        //ClaseD objD = new ClaseD();
    }
}

class ClaseF {

    public int publicF;
    int defaultF;
    private int privateF;
}
