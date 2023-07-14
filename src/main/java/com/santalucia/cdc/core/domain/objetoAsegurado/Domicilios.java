package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.objetoAsegurado.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Domicilios {
    private CharSequence idDomicilio;
    private Pais pais;
    private Provincia provincia;
    private Localidad localidad;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPobla denomPobla;
    private CharSequence codPostal;
    private TipoVia tipoVia;
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
