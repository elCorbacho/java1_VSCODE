
//clase persona y sus atributos
public class persona {
    String nombrePersona;
    Integer edadPersona;
    String sexoPersona;

    // constructor
    public persona(String nombrePersona, Integer edadPersona, String sexoPersona) {
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
        this.sexoPersona = sexoPersona;
    }

    // metodo main
    public static void main(String[] args) {
        persona persona1 = new persona("Juan", 25, "Masculino");
        persona persona2 = new persona("Maria", 30, "Femenino");

        System.out.println("Nombre: " + persona1.nombrePersona + " Edad: " + persona1.edadPersona + " Sexo: " + persona1.sexoPersona);
        System.out.println("Nombre: " + persona2.nombrePersona + " Edad: " + persona2.edadPersona + " Sexo: " + persona2.sexoPersona);
    }

}




