
package entidades;

import java.util.Date;
import java.util.List;


public class Ingreso {
    
    private int id;
    private int usuarioId;
    private String usuarioNombre;
    private int personaId;
    private String personaNombre;
    private String tipoComprobante;
    private String serieComprobante;
    private String numComprobante;
    private Date fecha;
    private double impuesto;
    private double total;
    private String  estado;
    private List<detalleIngreso> detalles;

    public Ingreso() {
    }

    public Ingreso(int id, int usuarioId, String usuarioNombre, int personaId, String personaNombre, String tipoComprobante, String serieComprobante, String numComprobante, Date fecha, double impuesto, double total, String estado, List<detalleIngreso> detalles) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.personaId = personaId;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
        this.detalles = detalles;
    }

    public Ingreso(int id, int usuarioId, String usuarioNombre, int personaId, String personaNombre, String tipoComprobante, String serieComprobante, String numComprobante, Date fecha, double impuesto, double total, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.usuarioNombre = usuarioNombre;
        this.personaId = personaId;
        this.personaNombre = personaNombre;
        this.tipoComprobante = tipoComprobante;
        this.serieComprobante = serieComprobante;
        this.numComprobante = numComprobante;
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.total = total;
        this.estado = estado;
    }

    
            
            
            
            
}


