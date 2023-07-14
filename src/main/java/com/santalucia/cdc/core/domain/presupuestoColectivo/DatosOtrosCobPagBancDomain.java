package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatosOtrosCobPagBancDomain {
    private TipoDomBancOtroCobDomain tipoDomBancOtroCobDomain;
    private EntidadBancOtroCobDomain entidadBancOtroCobDomain;
    private CharSequence numDigContrNumCuent;
    private CharSequence numDigContrEntidOfic;
    private CharSequence numCuentaBanc;
    private CharSequence titulCuentBanc;
    private CharSequence codIban;
    private CharSequence codBic;
}
