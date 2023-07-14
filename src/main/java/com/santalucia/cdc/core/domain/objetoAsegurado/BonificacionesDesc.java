package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class BonificacionesDesc {
    private BonDesNvlPoliza bonDesNvlPoliza;
    private Double impBonificacion;
    private CharSequence porCesionComisionMed;
    private CharSequence impTasaBonificacion;
    private CharSequence indCalculoBonific;
}
