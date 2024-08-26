package model;

public class Cliente {
    private String nombre;
    private String telefono;

    //Constructor
    public Cliente (String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }



    //getter
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }


    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
