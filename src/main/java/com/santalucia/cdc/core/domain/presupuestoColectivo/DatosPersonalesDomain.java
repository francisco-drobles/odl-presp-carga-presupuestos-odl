package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
@Data
@NoArgsConstructor
public class DatosPersonalesDomain {
    private TipoRolDomain tipoRolDomain;
    private CharSequence numOrdenRol;
    private CharSequence numIdPersona;
    private CharSequence numIdCliente;
    private TipoPersonaDomain tipoPersonaDomain;
    private TipoDocumentoDomain tipoDocumentoDomain;
    private CharSequence numDocumento;
    private SexoPersonaDomain sexoPersonaDomain;
    private CharSequence txtNombre;
    private CharSequence txtPrimerApellido;
    private CharSequence txtSegundoApellido;
    private CharSequence txtRazonSocial;
    private Instant fecNacimiento;
    private ProfesionDomain profesionDomain;
    private AgrupProfesionDomain agrupProfesionDomain;
    private NacionalidadDomain nacionalidadDomain;
    private CharSequence indEstadoCivil;
    private DomicilioPersDomain domicilioPersDomain;
    private List<MediosDeContactosDomain> mediosDeContactoDomains;
}
