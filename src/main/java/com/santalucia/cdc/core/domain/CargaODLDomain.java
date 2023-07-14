package com.santalucia.cdc.core.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Objeto presupuesto
 *
 * @author Nfq
 *
 */
@Data
@NoArgsConstructor
public class CargaODLDomain {
	/**
     * Capacidad inicial por defecto
     */
    private static final int DEFAULT_CAPACITY = 10;
    private CharSequence indTipoEvento;
    private PresupuestoIndividualDomain presupuestoIndividual;
    private PresupuestoColectivoDomain presupuestoColectivo;
    private ObjetosAseguradosDomain objetosAsegurados;
    private DeclaracionDomain declaracion;
	
}
