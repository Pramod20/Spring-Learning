/**
 * 
 */
package com.academy.dashboard.topics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.academy.dashboard.course.Course;

/**
 * @author kkpramod
 *
 */
@Entity
@Table(name = "Topic")
public class Topic {
	@Id
	private String id;
	private String title;
	private String difficulty;
	
	@ManyToOne
	@JoinColumn
	private Course course;
	
	
	
	public Topic() {
		super();
	}
	
	public Topic(String id, String title, String difficulty, Course course) {
		super();
		this.id = id;
		this.title = title;
		this.difficulty = difficulty;
		this.course = course;
	}


	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	
	
}
