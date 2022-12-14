package Model.Entidades;

import Model.ClasesDB.TipoPlanillaDB;
import Model.ClasesDB.TipoJornadaDB;
import DAO.SNMPExceptions;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;

/**
 *
 * @author Gabri
 */
public class Planilla {

    int ID;
    int IdTipoJornada;
    Date FechaInicio;
    Date FechaFinal;
    Date FechaPago;
    int IdTipoPlanilla;

    String jornada;
    String tipo;

    public Planilla(int ID, int IdTipoJornada, Date FechaInicio, Date FechaFinal, Date FechaPago, int IdTipoPlanilla) throws SNMPExceptions, SQLException {
        this.ID = ID;
        this.IdTipoJornada = IdTipoJornada;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.FechaPago = FechaPago;
        this.IdTipoPlanilla = IdTipoPlanilla;

        jornada = new TipoJornadaDB().getByID(IdTipoJornada).Nombre;
        tipo = new TipoPlanillaDB().getByID(IdTipoPlanilla).Nombre;
    }

    public Planilla(int ID, int IdTipoJornada, Date FechaInicio, Date FechaFinal,
            Date FechaPago, int IdTipoPlanilla, String jornada, String tipo) throws SNMPExceptions, SQLException {
        this.ID = ID;
        this.IdTipoJornada = IdTipoJornada;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.FechaPago = FechaPago;
        this.IdTipoPlanilla = IdTipoPlanilla;

        this.jornada = jornada;
        this.tipo = tipo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIdTipoPlanilla() {
        return IdTipoPlanilla;
    }

    public void setIdTipoPlanilla(int IdTipoPlanilla) {
        this.IdTipoPlanilla = IdTipoPlanilla;
    }

    public int getIdTipoJornada() {
        return IdTipoJornada;
    }

    public void setIdTipoJornada(int IdTipoJornada) {
        this.IdTipoJornada = IdTipoJornada;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
