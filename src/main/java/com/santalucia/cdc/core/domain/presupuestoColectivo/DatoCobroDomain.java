package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class DatoCobroDomain {
    private NivelCobroDomain nivelCobroDomain;
    private FormaPagoDomain formaPagoDomain;
    private MedioCobroPagoDomain medioCobroPagoDomain;
    private DatoMedioCobroDomain datoMedioCobroDomain;
    private List<DatosOtrosCobPagBancDomain> datosOtrosCobPagBancDomain;
}
