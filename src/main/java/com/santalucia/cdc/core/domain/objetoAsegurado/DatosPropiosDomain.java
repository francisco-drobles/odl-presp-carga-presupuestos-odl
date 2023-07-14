package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatosPropiosDomain {
    private RamoContableDomain ramoContableDomain;
    private ModalidadContableDomain modalidadContableDomain;
    private ItinerarioDomain itinerarioDomain;
}
