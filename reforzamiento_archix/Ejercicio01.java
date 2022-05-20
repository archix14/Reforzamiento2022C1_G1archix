import java.util.Scanner;

/**
 * Ejercicio01
 */
public class Ejercicio01 {

  public static void mostrarcursoDia() {
  //Definir Variable
  int diasem;
  String mensaje;
  //Leer datos 
  Scanner leerT=new Scanner(System.in);
  System.out.println("ingrese un dia de la semana:\n1=dom"+
  "\n2=lun\n3=martes\n4=Mie\n5=Jue\n6=vie\n7=sab"); 
  diasem=leerT.nextInt();
  //Proceso
      if (diasem==1) {
     mensaje="no hay clases";
      }else if(diasem==2) {
         mensaje="matematicas";
      }else if(diasem==3) {
         mensaje="programacion";
      }else if(diasem==4){
         mensaje="Vida Cristiana";
      }else if (diasem==5) {
          mensaje="programacion";
      }else if (diasem==6) {
          mensaje="matematiaca";
      }else if (diasem==7) {
          mensaje="no hay clases";
      } else{
          mensaje="El dia que coloco no existe";
      } 
        //Datos De Salida
        System.out.println("ese dia toca el curso de: "+mensaje);
    }   

        
     



public static void main(String[] args) {
    mostrarcursoDia();
    
}
}