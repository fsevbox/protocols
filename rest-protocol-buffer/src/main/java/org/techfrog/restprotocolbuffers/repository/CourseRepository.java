package org.techfrog.restprotocolbuffers.repository;

import org.techfrog.restprotocolbuffers.model.Course;

import java.util.Map;

public class CourseRepository {
    private Map<Integer, Course> courses;
    public CourseRepository(Map<Integer, Course> courses) {
        this.courses = courses;
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }
}
