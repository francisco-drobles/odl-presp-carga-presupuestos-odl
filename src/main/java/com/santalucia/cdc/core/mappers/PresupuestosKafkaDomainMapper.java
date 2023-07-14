package com.santalucia.cdc.core.mappers;

import com.santalucia.cdc.core.domain.CargaODLDomain;

public interface PresupuestosKafkaDomainMapper {

    CargaODLDomain toDomain(CargaODLValue cargaODLValue);

}
