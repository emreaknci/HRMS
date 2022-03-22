package yea.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yea.HRMS.business.abstracts.PositionService;
import yea.HRMS.dataAccess.abstracts.PositionDao;
import yea.HRMS.entities.concretes.JobPosition;

@Service
public class PositionManager implements PositionService {

	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.positionDao.findAll();
	}

}
