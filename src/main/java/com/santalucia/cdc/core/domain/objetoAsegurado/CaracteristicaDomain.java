package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class CaracteristicaDomain {
    private List<DomiciliosDomain> domicilios;
    private List<FigurasDomain> figuras;
    private List<AnimalesDomain> animales;
    private List<DispositivosElectrDomain> dispositivosElectrDomain;
}
