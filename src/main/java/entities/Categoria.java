package entities;

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

public class Categoria {
    @BsonId
    private ObjectId id;
    private String nombre;
    private String descripcion;
    private LocalDateTime createdAt;
    private boolean eliminado;
}
