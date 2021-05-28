import java.util.Calendar;

public class FechaHora {
    
    public static void main(String[]args){
Calendar fecha = Calendar.getInstance();

System.out.printf("%tc\n", fecha);//Incluye formato de salida con zona horaria 
System.out.printf("%tF\n", fecha);//año/mes/dia, 4 digitos para año 2 para mes y 2 para dia
System.out.printf("%tD\n", fecha);
System.out.printf("%tr\n", fecha);
System.out.printf("%tT\n", fecha);
System.out.printf("%1$tA\n", fecha);//Nombre del dia de la semana
System.out.printf("%1$ta\n", fecha);
System.out.printf("%1$tB\n", fecha);
System.out.printf("%1$tY\n", fecha);
System.out.printf("%1$te\n", fecha);
System.out.printf("%1$tB %1$tY\n", fecha);

    }
}