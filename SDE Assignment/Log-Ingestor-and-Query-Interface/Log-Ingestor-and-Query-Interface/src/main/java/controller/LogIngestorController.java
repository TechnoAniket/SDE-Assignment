package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.LogIngestor;
import service.LogIngestorService;

@RestController
@RequestMapping("/logg")
public class LogIngestorController {

	@Autowired
	private LogIngestorService logService;
	
	public LogIngestorController(LogIngestorService logService) {
		this.logService=logService;
	}
	
	
	@PostMapping("/save")
	public LogIngestor ingestlog(@RequestBody LogIngestor logIngestor) {
		return logService.ingestLog(logIngestor);
	}
	
	@GetMapping()
	public List<LogIngestor> findAllLogIngestor(){
		return logService.findAlllog();
	}
	
	
}
