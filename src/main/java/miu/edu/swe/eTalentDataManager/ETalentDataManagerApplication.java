package miu.edu.swe.eTalentDataManager;

import miu.edu.swe.eTalentDataManager.model.Athlete;
import miu.edu.swe.eTalentDataManager.repository.AthleteRepository;
import miu.edu.swe.eTalentDataManager.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ETalentDataManagerApplication {

	@Autowired
	private AthleteRepository service;

	@PostConstruct
	public void initAthletes() {
		List<Athlete> athletes = Stream.of(
				new Athlete(null,"123-45-67","Usain Bolt","567-998-0909",LocalDate.of(1996,1,12),LocalDate.of(2014,1,4),
					16,	100000.00,"godwin@gmail.com"),
		new Athlete(null,"123-45-68","Anna-Marie Rodriguez","567-998-0909",LocalDate.of(2000,5,21),LocalDate.of(2014,11,9),
				3,	100000.00,"john@gmail.com"),
		new Athlete(null,"123-45-69","Victor Luiz Garcia","567-998-0909",LocalDate.of(1988,1,12),LocalDate.of(2013,11,7),
				2,	100000.00,"musa@gmail.com")).collect(Collectors.toList());
		service.saveAll(athletes);
	}


//	List<Patient> patients = Stream.of(
//			new Patient(101L, "P567762", "Tusime Joel", false,"667-667-7080","hhe@gmail.com", LocalDate.of(1950,12,12)),
//			new Patient(101L, "P565762", "Moses Joseph", true,"867-667-9980","hhe@gmail.com", LocalDate.of(1953,12,12)),
//			new Patient(101L, "P567962", "Zabron Godwin", false,"668-667-9087","hhe@gmail.com", LocalDate.of(1990,12,12)),
//			new Patient(101L, "P567763", "Musime Musa", true,"627-667-8089","hhe@gmail.com", LocalDate.of(1999,12,12))
//	).collect(Collectors.toList());
//		repository.saveAll(patients);

	public static void main(String[] args) {
		SpringApplication.run(ETalentDataManagerApplication.class, args);
	}

}
