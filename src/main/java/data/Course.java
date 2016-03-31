package data;

import java.util.List;

public interface Course {

    /**
     * @return Name of the course.
     */
    String getName();

    /**
     * @return Number of ECTS (EAP) of the course.
     */
    Integer getCredit();

    /**
     * @return The duration of the course in terms.
     */
    Integer getDuration();

    /**
     * @return List of Syllabuses that represent the sessions of this course.
     */
    List<Syllabus> syllabuses();

    /**
     * @return Department to which the course belongs to.
     */
    Department getDepartment();

    /**
     * @return List of Courses that are prerequisite to this course.
     */
    List<Course> prerequisites();

    /**
     * @return List of Courses to which this course is a compulsory prerequisite to.
     */
    List<Course> prerequisiteTo();

    /**
     * @return Objectives of the course.
     */
    String getObjective();

    /**
     * @return Brief description of the course's topics.
     */
    String getDescription();

    /**
     * @return Description of the skills and knowledge the students have after passing the course.
     */
    String getLearningOutcomes();

}