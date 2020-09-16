package org.techfrog.restprotocolbuffers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.techfrog.restprotocolbuffers.model.Course;
import org.techfrog.restprotocolbuffers.repository.CourseRepository;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses/{id}")
    Course course(@PathVariable Integer id){
        return courseRepository.getCourse(id);
    }
}
