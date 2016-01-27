import java.util.List;

public interface Siiri {


    /**
     *
     * @param courseName
     * @return a list of Courses <strong>partially</strong> matching <code>courseName</code>
     */
    List<Course> courseByName(String courseName);

    /**
     * @param courseCode
     * @return a list of Courses <strong>partially</strong> matching <code>courseCode</code>
     */
    List<Course> courseByCode(String courseCode);


}
