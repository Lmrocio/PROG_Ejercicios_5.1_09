fun main() {


    val estudiante = Estudiante("Sergio", 20, "E01", "Ingeniería", 8.5)
    estudiante.mostrarRol()
    estudiante.mostrarCalificacion()

    val profesor = Profesor("Pilar", 40, "P001", "Matemáticas", 15)
    profesor.mostrarRol()
    profesor.mostrarExperiencia()
}