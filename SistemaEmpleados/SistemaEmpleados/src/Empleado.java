
public abstract class Empleado {

    private String id;
    private String nombre;
    private double salarioBase;
//Crear cosntructor
    public Empleado (String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario ();
    

//Siguietne paso Crear seters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }    


}





