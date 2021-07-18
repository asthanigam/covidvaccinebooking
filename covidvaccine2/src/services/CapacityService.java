package services;

import java.util.List;

import dao.CapacityDao;
import model.Capacity;

public class CapacityService {
    private CapacityDao capacityDao = new CapacityDao();
    public void saveCapacity(Capacity capacity)
    {
        capacityDao.saveCapacity(capacity);
        
    }
    public List<Capacity> getAllCapacities()
    {
        return capacityDao.getAllCapacities();
    }
}
