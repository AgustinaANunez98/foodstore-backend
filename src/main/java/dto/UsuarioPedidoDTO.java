package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioPedidoDTO {

    private ObjectId usuarioId;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private String direccion;
}
