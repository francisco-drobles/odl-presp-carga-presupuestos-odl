package com.santalucia.cdc.core.domain.presupuestoColectivo;

import com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.productoComercial;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Producto {
    private RamoComercial ramoComercial;
    private ModalidadComercial modalidadComercial;
    private ProductoTecnico productoTecnico;
    private com.santalucia.contratacion.presupuestos_odl.carga.avro.presupuestoColectivo.productoComercial productoComercial;
    private CharSequence desModalidadInterna;
}
