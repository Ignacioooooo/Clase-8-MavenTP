package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private String fechadenacimiento;


    @Getter @Setter
    private List<Persona> personas;
    public Persona(){
        this.personas = new ArrayList<>();
    }
    public void agregarPersona(Persona p){
        this.personas.add(p);
    }
    public void quitarPersona(Persona p){
        this.personas.remove(p);
    }
 public String toString(){
        return getNombre() + getApellido() +getFechadenacimiento();
 }
}
