public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juana");
        persona.setEdad(66);
        persona.setTelefono("2966123456");
        System.out.println("Persona: " + persona.getNombre() + ", su edad: " + persona.getEdad());
        System.out.println("y su telefono es "+ persona.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private String telefono;
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
}