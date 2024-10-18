/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author asanc
 */
public class DTO_Paciente {

    private String nombre, apellido, correo, t_Documento, t_Sangre, regimen, eps;
    private LocalDate fechaN;
    private int documento;

    public String getNombre() {
        return nombre;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getT_Documento() {
        return t_Documento;
    }

    public void setT_Documento(String t_Documento) {
        this.t_Documento = t_Documento;
    }

    public String getT_Sangre() {
        return t_Sangre;
    }

    public void setT_Sangre(String t_Sangre) {
        this.t_Sangre = t_Sangre;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

}
