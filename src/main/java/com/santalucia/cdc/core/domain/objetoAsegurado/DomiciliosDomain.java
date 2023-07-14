package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DomiciliosDomain {
    private CharSequence idDomicilio;
    private PaisDomain paisDomain;
    private ProvinciaDomain provinciaDomain;
    private LocalidadDomain localidadDomain;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPoblaDomain denomPoblaDomain;
    private CharSequence codPostal;
    private TipoViaDomain tipoViaDomain;
    private CharSequence desDomicilio;
    private CharSequence numNumero;
    private CharSequence numComplemento;
    private CharSequence numBloque;
    private CharSequence numPortal;
    private CharSequence numEscalera;
    private CharSequence numPiso;
    private CharSequence numPuerta;
    private CharSequence blNormalizado;
    private CharSequence desOtrosDatos;
}
