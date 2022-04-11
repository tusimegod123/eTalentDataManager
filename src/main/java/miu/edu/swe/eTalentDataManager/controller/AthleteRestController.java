package miu.edu.swe.eTalentDataManager.controller;

import miu.edu.swe.eTalentDataManager.model.Athlete;
import miu.edu.swe.eTalentDataManager.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AthleteRestController {
    @Autowired
    private AthleteService athleteService;

    @GetMapping("/eliteAthletes/list")
    public List<Athlete> eliteAthletes(){
        return athleteService.eliteAthletes();
    }

}
