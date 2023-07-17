package com.santalucia.cdc.core.domain;

import java.util.ArrayList;
import java.util.List;

import com.santalucia.cdc.core.domain.presupuestoColectivo.PresupuestoColectivoDomain;
import lombok.Data;
import lombok.NoArgsConstructor;
import  com.santalucia.amw.domain.presupuestoIndividual.PresupuestoIndividualDomain;
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

    public CargaODLDomain() {
    }
}
