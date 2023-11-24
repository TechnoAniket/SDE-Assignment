package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.LogIngestor;

public interface LogIngestorRepository extends JpaRepository<LogIngestor, Integer> {

}
