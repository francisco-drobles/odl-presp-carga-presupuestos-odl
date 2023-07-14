package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@NoArgsConstructor
public class FigurasDomain {
    private CharSequence idPersona;
    private TipoPersonaDomain tipoPersonaDomain;
    private CharSequence txtNombre;
    private CharSequence txtPrimerApellido;
    private CharSequence txtSegundoApellido;
    private CharSequence txtRazonSocial;
    private TipoDocumentoDomain tipoDocumentoDomain;
    private CharSequence numDocumento;
    private Instant fecNacimiento;
    private SexoDomain sexoDomain;
    private NacionalidadDomain nacionalidadDomain;
    private ProfesionDomain profesionDomain;
    private GrupoProfesionDomain grupoProfesionDomain;
    private CharSequence indEstadoCivil;
    private BeneficiarioDomain beneficiario;
}
