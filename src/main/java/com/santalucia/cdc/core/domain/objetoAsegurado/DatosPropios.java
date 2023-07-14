package com.santalucia.cdc.core.domain.objetoAsegurado;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatosPropios {
    private RamoContable ramoContable;
    private ModalidadContable modalidadContable;
    private Itinerario itinerario;
}
