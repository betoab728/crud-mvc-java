
package Modelo;

public class Persona {
    int Id;
    String DNI;
    String Nombres;

    public Persona() {
    }

    public Persona(int Id, String DNI, String Nombres) {
        this.Id = Id;
        this.DNI = DNI;
        this.Nombres = Nombres;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }
    
    

}
