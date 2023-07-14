package com.santalucia.amw.domain.presupuestoIndividual;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatoCobroDomain {
    private NivelCobro nivelCobro;
    private FormaPago formaPago;
    private MedioCobroPago medioCobroPago;
    private DatoMedioCobro datoMedioCobro;
    private List<DatosOtrosCobPagBanc> datosOtrosCobPagBanc;
}
