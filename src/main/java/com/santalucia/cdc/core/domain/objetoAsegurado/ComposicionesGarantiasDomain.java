package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ComposicionesGarantiasDomain {
    private GarantiaDomain garantiaDomain;
    private CharSequence indOrigenRecomendador;
    private List<ComposicionesSubgarantDomain> composicionesSubgarantDomain;
    private List<ComposicionesServiciosDomain> composicionesServicioDomains;
    private List<ComposicionesCaractDomain> composicionesCaractDomain;
}
