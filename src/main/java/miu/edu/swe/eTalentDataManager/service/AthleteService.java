package miu.edu.swe.eTalentDataManager.service;

import miu.edu.swe.eTalentDataManager.model.Athlete;
import miu.edu.swe.eTalentDataManager.repository.AthleteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AthleteService {
    AthleteRepository athleteRepository;

    public  AthleteService( AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }
    public void saveAthlete(Athlete  athlete){
        athleteRepository.save(athlete);
    }
        public List<Athlete> getAthlete(){
        return  athleteRepository.findAll(Sort.by(Sort.Direction.ASC,"fullName"));
        }
    public List<Athlete> eliteAthletes(){
        List<Athlete> athletes =  athleteRepository.findAll();
        return athletes.stream().filter(athlete -> (athlete.getTotalNumberOfMedalsWon() >= 3)).collect(Collectors.toList());
    }
}
