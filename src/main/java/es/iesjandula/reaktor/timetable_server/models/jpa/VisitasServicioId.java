package es.iesjandula.reaktor.timetable_server.models.jpa;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitasServicioId implements Serializable
{
	/**Referencia a la clave primaria id de la entidad alumno */
	private Long idAlumno;
	
	/**Referencia a la clave primaria nombre de la entidad curso */
	private CursoId cursoId;
	
	/**Fecha de ida al servicio del alumno */
	private Date fechaIda;
	
}
