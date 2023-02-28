package Paquete1;

import Paquete2.ClaseE;

public class ClaseA {

    public int publicA;
    int defaultA;
    private int privateA;

    public void prueba() {
        ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles 
        //objB.defaultB;

        ClaseC objC = new ClaseC();
        //objC.publicC; atributos visibles 
        //objC.defaultC;

        //Clase D es default en otro archivo 
        //pero mismo paquete 
        ClaseD objD = new ClaseD();
        //objD.publicD; atributos visibles
        //objD.defaultD;

        //Clase E esta en otro paquete y archivo
        //hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE; solo el atributo publico 

        //Clase F es default y es invisible
        //para las de este paquete 
        //ClaseF objF = new ClaseF();
    }
}

class ClaseB {

    public int publicB;
    int defaultB;
    private int privateB;
}
