package dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.Centre;
public class CentreDao {
        private static HashMap<Integer,Centre> centres = new HashMap<Integer,Centre>();
        private static int index = 0;

        public void saveCentre(Centre cutomerObj) {
            centres.put(index++, cutomerObj); 
        }

        public List<Centre> getAllCentres() {
            return  new ArrayList<Centre>(centres.values());
        }

}
