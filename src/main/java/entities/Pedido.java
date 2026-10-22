package entities;

import dto.UsuarioPedidoDTO;
import enums.Estado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pedido {
    @BsonId
    private ObjectId id;
    private UsuarioPedidoDTO usuario;
    private List<DetallePedido> detallePedido;
    private double total;
    private LocalDateTime fecha;
    private Estado estado;
    private boolean eliminado;
}
