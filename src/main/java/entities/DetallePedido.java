package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DetallePedido {
    private ObjectId productoId;
    private String nombreProducto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
}
