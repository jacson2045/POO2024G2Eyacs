package pe.edu.upeu.syscenterlife.modelo;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Cliente {
    String dniruc;
    String nombres;
    String documento;

}
