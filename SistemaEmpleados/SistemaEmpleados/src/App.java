import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args){
        
        EmpleadoTiempoCompleto empleado = new EmpleadoTiempoCompleto ("1234", "MerariGJ", 10000, "Transporte, hospedaaje, alimentos, IMSS, BonoProductividad");
        
        System.out.println("Empleado por tiempo completo");
        System.out.println("tu id es..." + empleado.getId());
        System.out.println("tu nombre es..." + empleado.getNombre());
        System.out.println("tu salario es..."+ empleado.calcularSalario());
        
        System.out.println("");

        System.out.println("Siguietne empleado por horas");
        
        EmpleadoPorHoras Empleado2 = new EmpleadoPorHoras("5678", "Antonia", 80, 40);
        
        System.out.println("tu id es..." + Empleado2.getId());
        System.out.println("tu nombre es..." + Empleado2.getNombre());
        System.out.println("tu salario es..."+ Empleado2.calcularSalario());


    }
    
}
