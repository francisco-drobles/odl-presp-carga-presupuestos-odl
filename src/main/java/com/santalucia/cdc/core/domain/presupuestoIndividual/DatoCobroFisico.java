package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoCobroFisico {
    private TipoDomCobro tipoDomCobro;
    private Pais pais;
    private Provincia provincia;
    private Localidad localidad;
    private CharSequence codMunicipio;
    private CharSequence codPostal;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucleoPobla;
    private DenomPoblaPers denomPoblaPers;
    private TipoVia tipoVia;
    private CharSequence descDomicilio;
    private CharSequence numDomicilio;
    private CharSequence compNumDomic;
    private CharSequence numBloqueDomic;
    private CharSequence numPortalDomic;
    private CharSequence numEscalDomic;
    private CharSequence numPisoDomic;
    private CharSequence numPuertaDomic;
    private CharSequence otrosDatosDomic;
}
