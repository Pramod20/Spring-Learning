/**
 * 
 */
package com.academy.dashboard.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//import com.academy.dashboard.topics.Topic;


/**
 * @author kkpramod
 *
 */

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public Optional<Course> getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public String addCourse(@RequestBody Course course)
	{
		String message = courseService.addCourse(course);
		return message;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/courses/{id}")
	public String updateCourse(@RequestBody Course course,@PathVariable String id)
	{
		String message = courseService.updateCourse(course,id);
		return message;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/courses/{id}")
	public String deleteCourse(@PathVariable String id)
	{
		String message = courseService.deleteCourse(id);
		return message;
	}

}
