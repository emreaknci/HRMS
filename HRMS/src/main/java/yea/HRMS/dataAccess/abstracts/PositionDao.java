package yea.HRMS.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import yea.HRMS.entities.concretes.JobPosition;

public interface PositionDao extends JpaRepository<JobPosition, Integer> {

}
