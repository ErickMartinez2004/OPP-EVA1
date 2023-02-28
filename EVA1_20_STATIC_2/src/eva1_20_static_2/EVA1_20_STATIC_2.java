package eva1_20_static_2;


public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        // TODO code application logic here
       /* final int x;
        x = 100;
        x = 200;//SOLO SE PUEDE ASIGNAR UNA VEZ */
        FormulasGeometria formulas = new FormulasGeometria();
        //formulas. no existe ningun método dentro de la objeto
        System.out.println("MI PI: " + FormulasGeometria.PI);
        System.out.println("Area Triangulo: " + FormulasGeometria.areaTriangulo(5.0,5.0 ));
        System.out.println("Volumen esfera: " + FormulasGeometria.volumenEsfera(10.0));
            
        
    }
    
}
