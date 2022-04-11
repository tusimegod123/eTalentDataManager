package miu.edu.swe.eTalentDataManager.controller;

import miu.edu.swe.eTalentDataManager.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/api")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @GetMapping(value = "/")
    public  String viewHomePage(){
       // model.addAttribute("athletes", athleteService.getAthlete());
        return  "home";
    }
    @GetMapping(value = "/athletes")
    public  String getAthletes(Model model){
        model.addAttribute("athletes", athleteService.getAthlete());
        return  "athletes";
    }

    @GetMapping(value = "/eliteAthletes")
    public  String getEliteAthletes(Model model){
        model.addAttribute("eliteAthletes", athleteService.eliteAthletes());
        return  "eliteAthletes";
    }
}
