class Estudiante(nombre: String,
                 edad: Int,
                 id: String,
                 val curso: String,
                 val calificacionPromedio: Double) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("$nombre tiene el rol: Estudiante")
    }

    fun mostrarCalificacion() {
        println("Calificación Promedio de $nombre del curso $curso: $calificacionPromedio")
    }
}