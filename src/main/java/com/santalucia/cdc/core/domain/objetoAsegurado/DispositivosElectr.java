package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DispositivosElectr {
    private MarcaDispElectr marcaDispElectr;
    private ModeloDispElectr modeloDispElectr;
    private CharSequence codIdentificador;
    private Double impCoste;
}
