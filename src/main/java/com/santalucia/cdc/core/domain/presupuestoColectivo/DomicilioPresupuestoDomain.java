package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DomicilioPresupuestoDomain {
    private CharSequence idDomicilio;
    private PaisPresupDomain paisPresupDomain;
    private LocalidadPresupDomain localidadPresupDomain;
    private ProvinciaPresupDomain provinciaPresupDomain;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPoblaPresupDomain denomPoblaPresupDomain;
    private CharSequence codPostal;
    private TipoViaPresupDomain tipoViaPresupDomain;
    private CharSequence desDomicilio;
    private CharSequence numNumero;
    private CharSequence numComplemento;
    private CharSequence numBloque;
    private CharSequence numPortal;
    private CharSequence numEscalera;
    private CharSequence numPiso;
    private CharSequence numPuerta;
    private CharSequence bINormalizado;
    private CharSequence desOtrosDatos;
}
