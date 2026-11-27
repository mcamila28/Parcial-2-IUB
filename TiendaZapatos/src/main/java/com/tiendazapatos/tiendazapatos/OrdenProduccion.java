package com.tiendazapatos.tiendazapatos;

import java.time.LocalDate;

public class OrdenProduccion {

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }

    public void setFechaEstimadaEntrega(LocalDate fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }

    public int getCantidadFabricar() {
        return cantidadFabricar;
    }

    public void setCantidadFabricar(int cantidadFabricar) {
        this.cantidadFabricar = cantidadFabricar;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

    public Zapato getZapato() {
        return zapato;
    }

    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    private LocalDate fechaInicio;
    private LocalDate fechaEstimadaEntrega;
    private int cantidadFabricar;
    private EstadoOrden estado;
    private Zapato zapato;
    private Trabajador trabajador;
}

