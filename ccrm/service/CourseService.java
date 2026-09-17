package ccrm.service;

import ccrm.domain.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course findCourseByCode(String code) {
        for (Course c : courses) {
            if (c.getCode().equals(code)) {   // ✅ use getCode()
                return c;
            }
        }
        return null;
    }
}