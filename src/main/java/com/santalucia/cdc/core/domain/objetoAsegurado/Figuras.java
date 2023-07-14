package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class Figuras {
    private CharSequence idPersona;
    private TipoPersona tipoPersona;
    private CharSequence txtNombre;
    private CharSequence txtPrimerApellido;
    private CharSequence txtSegundoApellido;
    private CharSequence txtRazonSocial;
    private TipoDocumento tipoDocumento;
    private CharSequence numDocumento;
    private Instant fecNacimiento;
    private Sexo sexo;
    private Nacionalidad nacionalidad;
    private Profesion profesion;
    private GrupoProfesion grupoProfesion;
    private CharSequence indEstadoCivil;
    private Beneficiario beneficiario;
}
