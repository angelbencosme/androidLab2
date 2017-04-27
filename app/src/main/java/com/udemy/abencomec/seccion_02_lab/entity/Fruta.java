package com.udemy.abencomec.seccion_02_lab.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abencomec on 3/16/2017.
 */

public class Fruta {
    private BigDecimal id;
    private String nombre;
    private String origen;
    private int icon;


    public Fruta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruta)) return false;

        Fruta fruta = (Fruta) o;

        return getId() != null ? getId().equals(fruta.getId()) : fruta.getId() == null;
    }
    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
