package entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "LOG_INGESTOR_DB")
@AllArgsConstructor
@NoArgsConstructor
public class LogIngestor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String level;
	private String message;
	private String  resourceId;
	private LocalDateTime timestamp;
	private String traceId;
	private String spanId;
	private String commit;
	private String parentResourceId;
}
