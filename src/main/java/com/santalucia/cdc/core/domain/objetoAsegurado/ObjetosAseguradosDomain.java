package com.santalucia.cdc.core.domain.objetoAsegurado;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.Metadata;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ObjetosAseguradosDomain {
    private DatoIdentificativoDomain datoIdentificativoDomain;
    private CaracteristicaDomain caracteristicaDomain;
    private List<UnidadesTarificacionDomain> unidadesTarificacionDomain;
    private List<CampannasDomain> campannas;
    private Metadata metadata;
}
