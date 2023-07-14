package com.santalucia.amw.domain.presupuestoIndividual;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DatosOtrosCobPagBancDomain {
    private TipoDomBancOtroCob tipoDomBancOtroCob;
    private EntidadBancOtroCob entidadBancOtroCob;
    private CharSequence numDigContrNumCuent;
    private CharSequence numDigContrEntidOfic;
    private CharSequence numCuentaBanc;
    private CharSequence titulCuentBanc;
    private CharSequence codIban;
    private CharSequence codBic;
}
