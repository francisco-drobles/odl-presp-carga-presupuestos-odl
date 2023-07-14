package com.santalucia.cdc.core.domain.presupuestoColectivo;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class DatoCobroBancarioDomain {
    private TipoDomBancarioDomain tipoDomBancarioDomain;
    private EntidadBancariaDomain entidadBancariaDomain;
    private CharSequence numDigContrNumCuent;
    private CharSequence numDigContrEntidOfic;
    private CharSequence numCuentBanc;
    private CharSequence titulCuentBanc;
    private CharSequence codIban;
    private CharSequence codBic;
}
