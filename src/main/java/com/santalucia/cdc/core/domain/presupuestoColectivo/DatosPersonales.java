package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
@Data
@NoArgsConstructor
public class DatosPersonales {
    private TipoRol tipoRol;
    private CharSequence numOrdenRol;
    private CharSequence numIdPersona;
    private CharSequence numIdCliente;
    private TipoPersona tipoPersona;
    private TipoDocumento tipoDocumento;
    private CharSequence numDocumento;
    private SexoPersona sexoPersona;
    private CharSequence txtNombre;
    private CharSequence txtPrimerApellido;
    private CharSequence txtSegundoApellido;
    private CharSequence txtRazonSocial;
    private Instant fecNacimiento;
    private Profesion profesion;
    private AgrupProfesion agrupProfesion;
    private Nacionalidad nacionalidad;
    private CharSequence indEstadoCivil;
    private DomicilioPers domicilioPers;
    private List<MediosDeContactos> mediosDeContactos;
}
