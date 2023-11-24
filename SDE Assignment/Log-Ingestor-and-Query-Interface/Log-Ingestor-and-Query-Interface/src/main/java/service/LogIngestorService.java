package service;

import org.slf4j.LoggerFactory;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;

import controller.LogIngestorController;
import entity.LogIngestor;
import repository.LogIngestorRepository;


@Service
public class LogIngestorService {

	@Autowired
	private LogIngestorRepository logRepo;
	
	public LogIngestorService(LogIngestorRepository logRepo) {
		this.logRepo = logRepo;	
	}
	
	private static final Logger log = LoggerFactory.getLogger(LogIngestorController.class);
	
	public LogIngestor  ingestLog(LogIngestor logIngestor) {
	LogIngestor savedLog=  logRepo.save(logIngestor) ;
	String status = (savedLog != null)? "Success":"fail";
	log.info("Log Ingested Successfully : {}, Status :{}" ,logIngestor , status);
//	log.info("Log Ingested Successfully : {}" + logIngestor + "Status : " + status);
	return savedLog;
	}
	
	
	public List<LogIngestor> findAlllog(){
		List<LogIngestor> result = logRepo.findAll();
		log.info("Search logs results : {}",result);
		return result;
	}


	
	
//	public List<LogIngestor> findAlllog(@RequestParam(required = false) String level,
//                                     @RequestParam(required = false) String message,
//                                     @RequestParam(required = false) String resourceId,
//                                     @RequestParam(required = false)
//                                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDate startTime,
//                                     @RequestParam(required = false)
//                                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endTime){
//		List<LogIngestor> result = logRepo.findAll();
//		log.info("Search logs results : {}",result);
//		return result;
//		
//	}
	
	
	
	
	
}
