package com.ashish.coursemanagement.services;

import com.ashish.coursemanagement.Entities.Course;
import com.ashish.coursemanagement.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServicesMain implements CoursesServices{
    @Autowired
    private CourseRepository courseRepository;
//    List<Course> courses;
    CoursesServicesMain(){
//        courses = new ArrayList<>();
//        courses.add(new Course(101,"Spring boot Course","For Job 1 As Soon As Possible"));
//        courses.add(new Course(102,"Core Java Course","For Job 2 As Soon As Possible"));
//        courses.add(new Course(103,"Automation Course","For Job 3 As Soon As Possible"));

    }
    @Override
    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(long id) {
//        for(int i=0;i<=courses.size();i++){
//            if(courses.get(i).getId()==id){
//                return courses.get(i);
//            }
//        }
        return courseRepository.getOne(id);
    }

    @Override
    public Course addCourse(Course course) {
//        courses.add(course);
//        return course;
        courseRepository.save(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
//        for(int i=0;i<=courses.size();i++){
//            if(courses.get(i).getId()==course.getId()){
//                courses.add(i,course);
//                return course;
//            }
//            }
        courseRepository.save(course);
        return course;
        }
    @Override
    public void deleteCourseById(long id) {
//        for(int i=0;i<=courses.size();i++){
//            if(courses.get(i).getId()==id){
//                return courses.remove(i);
//            }
//        }
        Optional<Course> deleted=courseRepository.findById(id);
        if(deleted.isPresent()){
            Course realValue = deleted.get();
            courseRepository.delete(realValue);
        }

    }

    }

