package com.santalucia.cdc.core.domain.declaracion;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.Metadata;
import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.Caracteristicas;
import com.santalucia.contratacion.presupuestos_odl.carga.avro.declaracion.DatoIdentificativo;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeclaracionDomain {
    private DatoIdentificativoDomain datoIdentificativoDomain;
    private List<CaracteristicasDomain> caracteristicas;
    private Metadata metadata;
}
