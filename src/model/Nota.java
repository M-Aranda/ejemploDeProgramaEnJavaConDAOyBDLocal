/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Cheloz
 */
public class Nota {
    
    private int id;
    private int valor;
    private int porcentaje;
    private Asignatura asig;

    public Nota() {
    }

    public Nota(int id, int valor, int porcentaje, Asignatura asig) {
        this.id = id;
        this.valor = valor;
        this.porcentaje = porcentaje;
        this.asig = asig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Asignatura getAsig() {
        return asig;
    }

    public void setAsig(Asignatura asig) {
        this.asig = asig;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + this.valor;
        hash = 67 * hash + this.porcentaje;
        hash = 67 * hash + Objects.hashCode(this.asig);
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
        final Nota other = (Nota) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.valor != other.valor) {
            return false;
        }
        if (this.porcentaje != other.porcentaje) {
            return false;
        }
        if (!Objects.equals(this.asig, other.asig)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nota{" + "id=" + id + ", valor=" + valor + ", porcentaje=" + porcentaje + ", asig=" + asig + '}';
    }
    
    
    
}
