package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DomicilioPersDomain {
    private CharSequence idDomicilio;
    private PaisDomPersDomain paisDomPersDomain;
    private LocalidadDomPersDomain localidadDomPersDomain;
    private ProvinciaDomPersDomain provinciaDomPersDomain;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucPobla;
    private DenomPoblaDomPersDomain denomPoblaDomPersDomain;
    private CharSequence codPostal;
    private TipoViaDomPersDomain tipoViaDomPersDomain;
    private CharSequence desDomicilio;
    private CharSequence numDomicilio;
    private CharSequence numComplemento;
    private CharSequence numBloque;
    private CharSequence numPortal;
    private CharSequence numEscalera;
    private CharSequence numPiso;
    private CharSequence numPuerta;
    private CharSequence bINormalizado;
    private CharSequence desOtrosDatos;
}
