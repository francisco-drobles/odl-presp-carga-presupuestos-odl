package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DomicilioPers {
    private CharSequence idDomicilio;
    private PaisDomPers paisDomPers;
    private LocalidadDomPers localidadDomPers;
    private ProvinciaDomPers provinciaDomPers;
    private CharSequence codMunicipio;
    private CharSequence codEntColectiva;
    private CharSequence codEntSingular;
    private CharSequence codNucPobla;
    private DenomPoblaDomPers denomPoblaDomPers;
    private CharSequence codPostal;
    private TipoViaDomPers tipoViaDomPers;
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
