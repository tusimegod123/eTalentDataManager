package miu.edu.swe.eTalentDataManager.repository;

import miu.edu.swe.eTalentDataManager.model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Long> {
}
