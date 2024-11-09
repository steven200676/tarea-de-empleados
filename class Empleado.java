class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario);
    }
}

import java.util.ArrayList;
import java.util.List;

class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();

        Empleado empleado1 = new Empleado("Juan", 30, 2500.0);
        Empleado empleado2 = new Empleado("Ana", 28, 2700.0);

        gestor.agregarEmpleado(empleado1);
        gestor.agregarEmpleado(empleado2);

        gestor.mostrarEmpleados();
    }
}