package com.ashish.coursemanagement.controller;

import com.ashish.coursemanagement.Entities.Course;
import com.ashish.coursemanagement.services.CoursesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CoursesServices coursesServices;



    @GetMapping("/courses")
    public List<Course> getAllCourses() {

        return coursesServices.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable long id) {

        return coursesServices.getCourseById(id);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.coursesServices.addCourse(course);
    }

    @PutMapping("/courses")
    public Course putCourse(@RequestBody Course course) {
        return coursesServices.putCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourseById(@PathVariable long id) {

         coursesServices.deleteCourseById(id);
    }
}
