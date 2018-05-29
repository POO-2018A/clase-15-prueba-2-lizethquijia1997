/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {
    private String Nombre;
    private int edad;
    private Materias [] materia;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materias[] getMateria() {
        return materia;
    }

    public void setMateria(Materias[] materia) {
        this.materia = materia;
    }

   

    public Estudiantes(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiantes other = (Estudiantes) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Arrays.deepEquals(this.materia, other.materia)) {
             System.out.println("Son iguales en la");
            return false;
        }
        return true;
    }

    
    
    
    
}
