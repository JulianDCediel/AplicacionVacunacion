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
public class DTO_Vacunacion {

    private int N_dosis,docP;
    private String marca, lote, eps;
    private LocalDate fecha;

    public int getN_dosis() {
        return N_dosis;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setN_dosis(int N_dosis) {
        this.N_dosis = N_dosis;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDocP() {
        return docP;
    }

    public void setDocP(int docP) {
        this.docP = docP;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

}
