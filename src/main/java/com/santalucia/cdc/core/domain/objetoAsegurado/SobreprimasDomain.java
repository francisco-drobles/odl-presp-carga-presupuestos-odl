package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class SobreprimasDomain {
    private SobrepNvlPolizaDomain sobrepNvlPolizaDomain;
    private Double impSobreprima;
    private CharSequence impTasaSobreprima;
    private CharSequence indCalculoSobreprima;
}
