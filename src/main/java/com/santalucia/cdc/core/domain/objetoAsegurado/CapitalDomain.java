package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class CapitalDomain {
    private double impCapital;
    private Double impCapitalReducido;
    private Double impCapitalBasico;
    private Double impCapitalNivelado;
    private Double impCapitalConsolidado;
    private Double impCapitalNatural;
    private Double impTramitacionSiniestros;
    private Double impTrasladoMut;
    private Double porIncrementoCapital;
    private List<PrevisionesDomain> previsiones;
}
