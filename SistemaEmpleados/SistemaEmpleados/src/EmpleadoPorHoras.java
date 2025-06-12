public class EmpleadoPorHoras extends Empleado {
    
    private int horasTrabajadas;

    public EmpleadoPorHoras (String id, String nombre, double salarioBase, int horasTrabajadas){
        super (id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;

    } 
//Creazr getters ans setters
    public int gethorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return getSalarioBase()* horasTrabajadas;
        
    }

    

}



