/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SecretariaSalud;

import Controlador.Controlador_1;
import Controlador.Controlador_10_MA;
import Controlador.Controlador_2_MV;
import Controlador.Controlador_4_RP;
import Controlador.Controlador_5_BMP;
import Controlador.Controlador_6_MP;
import Controlador.Controlador_7_AV;
import Controlador.Controlador_8_RE;
import Controlador.Controlador_9_RP;
import Controlador.Controlador_BuscarEditarEmpleado;
import Controlador.Controlador_BuscarEmpleado;
import Controlador.Controlador_DatosEmpleado;
import Controlador.Controlador_EditarEmpleado;
import Controlador.Controlador_InformeDosisGENERAL;
import Controlador.Controlador_InformeEmpleados;
import Controlador.Controlador_InformePacientes;
import Controlador.Controlador_InformeVacunas;
import Controlador.Controlador_Informes;
import Modelo.DAO_Lote;
import Modelo.DAO_Paciente;
import Modelo.DAO_Trabajador;
import Modelo.DAO_Vacunacion;
import Modelo.DTO_Lote;
import Modelo.DTO_Paciente;
import Modelo.DTO_Trabajador;
import Modelo.DTO_Vacunacion;
import Modelo.Puestas;
import vistas_proyecto.Admin_Vacunas;
import vistas_proyecto.BuscarModificar_Empleado;
import vistas_proyecto.BuscarModificar_Paciente;
import vistas_proyecto.Buscar_Empleado;
import vistas_proyecto.Datos_Empleado;
import vistas_proyecto.Generar_Informes;
import vistas_proyecto.InformeDosisGENERAL;
import vistas_proyecto.InformeEmpleados;
import vistas_proyecto.InformePacientes;
import vistas_proyecto.InformeVacunas;
import vistas_proyecto.Login;
import vistas_proyecto.Menu_Principal;
import vistas_proyecto.Menu_Principal_Admin;
import vistas_proyecto.Modificar_Empleado;
import vistas_proyecto.Modificar_Paciente;
import vistas_proyecto.Registro_Empleado;
import vistas_proyecto.Registro_Paciente;
import vistas_proyecto.Registro_pedidos;

/**
 *
 * @author asanc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Login vlog = new Login();
        Menu_Principal VMprinV = new Menu_Principal();
        Registro_Paciente VRP = new Registro_Paciente();
        BuscarModificar_Paciente VBMP = new BuscarModificar_Paciente();
        Admin_Vacunas VAV = new Admin_Vacunas();
        Menu_Principal_Admin VMprinA = new Menu_Principal_Admin();
        DTO_Trabajador dtoT = new DTO_Trabajador();
        DAO_Trabajador daoT = new DAO_Trabajador();
        DTO_Paciente dtoP = new DTO_Paciente();
        DAO_Paciente daoP = new DAO_Paciente();
        DTO_Vacunacion dtoVac = new DTO_Vacunacion();
        DAO_Vacunacion daoVac = new DAO_Vacunacion();
        DTO_Lote dtoL = new DTO_Lote();
        DAO_Lote daoL = new DAO_Lote();
        Modificar_Paciente VMP = new Modificar_Paciente();
        Registro_Empleado VRE = new Registro_Empleado();
        Registro_pedidos VRPE = new Registro_pedidos();
        BuscarModificar_Empleado VBME = new BuscarModificar_Empleado();
        Buscar_Empleado VBE = new Buscar_Empleado();
        Generar_Informes VGI = new Generar_Informes();
        Modificar_Empleado modE2 = new Modificar_Empleado();
        Datos_Empleado dataEmp = new Datos_Empleado();
        InformeEmpleados infE = new InformeEmpleados();
        InformePacientes infP = new InformePacientes();
        InformeVacunas infV = new InformeVacunas();
        InformeDosisGENERAL infD = new InformeDosisGENERAL();
        Puestas puesta = new Puestas();
        Controlador_1 contr_1 = new Controlador_1(vlog, VMprinV, VMprinA, dtoT, daoT);
        Controlador_2_MV contr_2 = new Controlador_2_MV(vlog, VMprinV, VRP, VBMP, VAV, dtoT, daoT);
        Controlador_4_RP contr_4 = new Controlador_4_RP(dtoP, daoP, VMprinV, VRP);
        Controlador_5_BMP contr_5 = new Controlador_5_BMP(dtoP, daoP, VBMP, VMprinV, VMP);
        Controlador_6_MP contr_6 = new Controlador_6_MP(dtoP, daoP, VMprinV, VMP);
        Controlador_7_AV contr_7 = new Controlador_7_AV(dtoVac, daoVac, VAV, VMprinV);
        Controlador_10_MA contr_10 = new Controlador_10_MA(vlog, VMprinA, VRE, VRPE, VBME, VBE, VGI);
        Controlador_8_RE contr_8 = new Controlador_8_RE(VMprinA, VRE, dtoT, daoT);
        Controlador_9_RP contr_9 = new Controlador_9_RP(VRPE, VMprinA, dtoL, daoL);
        Controlador_BuscarEditarEmpleado contr_bee = new Controlador_BuscarEditarEmpleado(dtoT, daoT, VBME, modE2, VMprinA);
        Controlador_EditarEmpleado contr_ee = new Controlador_EditarEmpleado(dtoT, daoT, modE2, VMprinA);
        Controlador_BuscarEmpleado contr_be = new Controlador_BuscarEmpleado(daoT, dtoT, VBE, dataEmp, VMprinA);
        Controlador_DatosEmpleado contr_daE = new Controlador_DatosEmpleado(dataEmp, VMprinA);
        Controlador_Informes contr_inf = new Controlador_Informes(VGI, VMprinA, infE, infP, infV, infD);
        Controlador_InformeDosisGENERAL contr_infD = new Controlador_InformeDosisGENERAL(infD, VGI, daoVac, dtoVac, daoL, dtoL,puesta);
        Controlador_InformeEmpleados contr_infE = new Controlador_InformeEmpleados(infE, VGI, daoT, dtoT);
        Controlador_InformePacientes contr_infP = new Controlador_InformePacientes(infP, VGI, daoP, dtoP);
        Controlador_InformeVacunas contr_infV = new Controlador_InformeVacunas(infV, VGI, daoL, dtoL);

        vlog.setVisible(true);
    }

}
