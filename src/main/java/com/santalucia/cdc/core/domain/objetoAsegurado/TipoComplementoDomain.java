package com.santalucia.cdc.core.domain.objetoAsegurado;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class TipoComplementoDomain {
    private CharSequence codOrigen;
    private CharSequence codMDL;
    private CharSequence descOrigen;
    private CharSequence numOrdenComplemento;
}
