package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Sobreprimas {
    private SobrepNvlPoliza sobrepNvlPoliza;
    private Double impSobreprima;
    private CharSequence impTasaSobreprima;
    private CharSequence indCalculoSobreprima;
}
