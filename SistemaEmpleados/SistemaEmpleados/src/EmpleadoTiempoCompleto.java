public class EmpleadoTiempoCompleto extends Empleado {

    private String beneficios;


    //Crear constructor-Iniciar constructor
       
    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios) {
        super(id, nombre, salarioBase);
        this.beneficios = beneficios;
    }

    public String getBeneficios() {
        return beneficios;
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        
        System.out.println("Tus beneficios son..." + beneficios);
        return getSalarioBase();


    } 

}

