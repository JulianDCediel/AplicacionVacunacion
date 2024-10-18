/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author ESTUDIANTE
 */
public class DTO_Lote {

    private int cantidad;
    private LocalDate F_ven, F_entr;
    private String Detalle, Lab, eps, N_lote;

    public String getN_lote() {
        return N_lote;
    }

    public void setN_lote(String N_lote) {
        this.N_lote = N_lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getF_ven() {
        return F_ven;
    }

    public void setF_ven(LocalDate F_ven) {
        this.F_ven = F_ven;
    }

    public LocalDate getF_entr() {
        return F_entr;
    }

    public void setF_entr(LocalDate F_entr) {
        this.F_entr = F_entr;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getLab() {
        return Lab;
    }

    public void setLab(String Lab) {
        this.Lab = Lab;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

}
