public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[]{
                new Estudiante("Ana", 20, new double[]{8.5, 9.0, 7.5}),
                new Estudiante("Luis", 22, new double[]{6.0, 5.5}),
                new Estudiante("Marta", 19, new double[]{9.5, 10.0}),
                new Estudiante("Carlos", 21, new double[]{}) // Error: sin notas
        };

        System.out.println("Calculando el mejor estudiante...");
        Estudiante mejor = GestorEstudiantes.encontrarMejorEstudiante(estudiantes);
        if(mejor != null) {
            System.out.println("El mejor estudiante es: " + mejor.getNombre()); // Posible NullPointerException
        }else{
            System.out.println("No se ha encontrado ningun estudiante");
        }
        System.out.println("Guardando resultados...");
        GestorEstudiantes.guardarResultados(estudiantes, "resultados.txt");
    }
}
