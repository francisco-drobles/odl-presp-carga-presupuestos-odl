package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class DatoCobro {
    private NivelCobro nivelCobro;
    private FormaPago formaPago;
    private MedioCobroPago medioCobroPago;
    private DatoMedioCobro datoMedioCobro;
    private List<DatosOtrosCobPagBanc> datosOtrosCobPagBanc;
}
