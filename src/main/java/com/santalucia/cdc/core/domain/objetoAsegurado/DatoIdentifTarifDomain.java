package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoIdentifTarifDomain {
    private TipoComplementoDomain tipoComplementoDomain;
    private CategoriaDomain categoriaDomain;
    private AgrupGarantiaDomain agrupGarantiaDomain;
    private CharSequence numOrdenAgrupGar;
    private CharSequence agrupGarantiaHog;
    private GarantiaUnitariaDomain garantiaUnitariaDomain;
    private CharSequence numOrdenPersonaRol;
    private RiesgoDomain riesgoDomain;
    private CharSequence edadTarificacion;
    private CharSequence codAplicacion;
}
