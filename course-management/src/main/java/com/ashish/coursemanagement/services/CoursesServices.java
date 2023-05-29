package com.ashish.coursemanagement.services;

import com.ashish.coursemanagement.Entities.Course;

import java.util.List;

public interface CoursesServices {
    public List<Course> getAllCourses();
    public Course getCourseById(long id);
    public Course addCourse(Course course);

    Course putCourse(Course course);
    public void deleteCourseById(long id);
}
