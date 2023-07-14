package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DispositivosElectrDomain {
    private MarcaDispElectrDomain marcaDispElectrDomain;
    private ModeloDispElectrDomain modeloDispElectrDomain;
    private CharSequence codIdentificador;
    private Double impCoste;
}
