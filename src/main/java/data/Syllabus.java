package data;

import java.util.List;

public interface Syllabus {

    /**
     * @return Course whose Syllabus this is
     */
    Course getCourse();

    /**
     * @return Semester on which this Syllabus takes place
     */
    Semester getSemester();

    /**
     * @return whether this Syllabus is for full-time study
     */
    Boolean isStationary();

    /**
     * @return number of attendants
     */
    Integer getAttendants();

    /**
     * @return list of teaching Lecturers
     */
    List<Lecturer> lecturers();

    /**
     * @return Language that is used for teaching
     */
    Language getLanguage();

    /**
     * @return whether this Syllabus's grading is differentiating
     */
    Boolean isDifferentiating();

    /**
     * @return minimum number of attendants required for it to take place
     */
    Integer minAttendants();

    /**
     * @return maximum number of attendants that are allowed to register
     */
    Integer maxAttendants();

}
