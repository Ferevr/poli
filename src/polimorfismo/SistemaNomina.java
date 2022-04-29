package polimorfismo;
import POL.*;

public class SistemaNomina {

    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado ("Daira", "Rodriguez", "111", 800.00);
        EmpleadoBaseMasComision empleadoPorComision = new EmpleadoBaseMasComision ("Gabriela", "Marquez", "215613216", 50.00, 0.2, 1500.00);
        EmpleadoPorComision empleadoComision = new EmpleadoPorComision ("Carlos", "Colutto", "513465", 21, 0.3);
        EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras ("Ricardo", "Hernandez", "4651165", 250, 8);
        
        System.out.println("Se procesan empleados por separado");
        System.out.printf("%S\n%s: $%,.2f\n\n", empleadoAsalariado, "Ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%S\n%s: $%,.2f\n\n", empleadoPorComision, "Ingresos", empleadoPorComision.ingresos());
        System.out.printf("%S\n%s: $%,.2f\n\n", empleadoComision, "Ingresos", empleadoComision.ingresos());
        System.out.printf("%S\n%s: $%,.2f\n\n", empleadoHoras, "Ingresos", empleadoHoras.ingresos());
        
        Empleado[] empleados = new Empleado[4];
        empleados[0]= empleadoAsalariado;
        empleados[1]= empleadoPorComision;
        empleados[2]= empleadoComision;
        empleados[3]=empleadoHoras;
        
        for (Empleado empleadoActual:empleados){
            System.out.println(empleadoActual);
            if(empleadoActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado =(EmpleadoBaseMasComision)empleadoActual;
                empleado.establecerSalarioBase(1.10*empleado.obtenerSalarioBase());
                System.out.printf("El nuevo salario Base con 10%% de incremento es: $%,.2f\n", empleado.obtenerSalarioBase());
            }
            
            System.out.printf("Ingresos $%,.2f\n\n", empleadoActual.ingresos()); //
            for (int j=0; j<empleados.length; j++){
                System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
            }
        }
    }
}
    

