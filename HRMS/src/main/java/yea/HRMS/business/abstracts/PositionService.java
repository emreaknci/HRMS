package yea.HRMS.business.abstracts;

import java.util.List;

import yea.HRMS.entities.concretes.JobPosition;

public interface PositionService {
	List<JobPosition> getAll();
}
