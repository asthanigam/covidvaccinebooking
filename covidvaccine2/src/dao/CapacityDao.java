package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Capacity;
public class CapacityDao {
        private static HashMap<Integer,Capacity> capacities = new HashMap<Integer,Capacity>();
        private static int index = 0;

        public void saveCapacity(Capacity cap) {
            capacities.put(index++, cap); 
        }

        public List<Capacity> getAllCapacities() {
            return  new ArrayList<Capacity>(capacities.values());
        }

}
