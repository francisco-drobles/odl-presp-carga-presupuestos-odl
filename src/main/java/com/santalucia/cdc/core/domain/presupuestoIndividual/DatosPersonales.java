package com.santalucia.amw.domain.presupuestoIndividual;

import java.time.Instant;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

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
