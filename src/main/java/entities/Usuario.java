package entities;

import enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
    @BsonId
    private ObjectId id;
    private String nombreCompleto;
    private String email;
    private String telefono;
    private String direccion;
    private Rol rol;
    private LocalDateTime createdAt;
    private boolean eliminado;
}
