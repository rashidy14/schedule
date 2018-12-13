package 	dal;
import java.util.List;

import dto.*;


public interface PreferenceDAO {

    public List<Preference> getPreferences(Instructor instructor);
    public List<Preference> getPreferences(Course course);

    public boolean insert(List<Preference> preferences);
    public boolean delete(Instructor instructor);

}
