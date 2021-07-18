package services;

import java.util.List;

import dao.CentreDao;
import model.Centre;

public class CentreService {
    private CentreDao centreDao = new CentreDao();
    public void saveCentre(Centre centre)
    {
        centreDao.saveCentre(centre);
        
    }
    public List<Centre> getAllCentres()
    {
        return centreDao.getAllCentres();
    }

}
