class Profesor(
    nombre: String,
    edad: Int,
    id: String,
    val departamento: String,
    val aniosExperiencia: Int
) : Persona(nombre, edad, id) {

    override fun mostrarRol() {
        println("$nombre tiene el rol: Profesor")
    }

   fun mostrarExperiencia() {
        println("Años de experiencia de $nombre del departamento $departamento: $aniosExperiencia")
    }
}