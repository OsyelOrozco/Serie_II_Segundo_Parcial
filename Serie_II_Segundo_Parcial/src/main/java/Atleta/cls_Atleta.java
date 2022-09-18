
package Atleta;


public class cls_Atleta {
    
    
    //Atributos
    int Identificador_Atleta;
    String Nombre;
    String Apellido;
    double tiempo;
    static int contador = 0;
    static String seleccion="Colombia";
    static double Tiempo_Equipo;

    //constructor

    public cls_Atleta(String Nombre, String Apellido, double tiempo) {
        
        contador++;
        Identificador_Atleta = contador;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.tiempo = tiempo;
    }
    
    
    //metodo
    public void corre400mts(){
        
        Tiempo_Equipo = Tiempo_Equipo + tiempo;
    }
    
    
    //mostrar en pantalla los datos del atleta
    public void imprime(){
        System.out.println("Idetificadr del atleta: "+Identificador_Atleta);
        System.out.println("Nombre del atleta: " +Nombre);
        System.out.println("Apellido del atleta: " +Apellido);
        System.out.println("Tiempo del atleta: " +tiempo);
        System.out.println("");
        
    }
    
    //mostrar en pantalla el nombre de la seleccion
    public static void imprimeSeleccion(){
        
        System.out.println("Seleccion: " +seleccion);
        
    }
    
    //mostrar en pantalla el tiempo del equipo
    public static void imprimeTiempo(){
        
        System.out.println("Tiempo del equipo es de: " +Tiempo_Equipo);
        
    }
    
    public static void main (String args[]){
        
        cls_Atleta atleta1 = new cls_Atleta("Osyel","Orozco",13.4);
        atleta1.corre400mts();
        
        cls_Atleta atleta2 = new cls_Atleta("Aramis","Castillo",19.6);
        atleta1.corre400mts();
        
        cls_Atleta atleta3 = new cls_Atleta("Madelin","Castro",12.9);
        atleta1.corre400mts();
        
        cls_Atleta atleta4 = new cls_Atleta("Esteban","Velazquez",14.8);
        atleta1.corre400mts();
        
        cls_Atleta.imprimeSeleccion();
        
        atleta1.imprime();
        atleta2.imprime();
        atleta3.imprime();
        atleta4.imprime();
        
        cls_Atleta.imprimeTiempo();
        
        
        
    }
    
}

  
    

