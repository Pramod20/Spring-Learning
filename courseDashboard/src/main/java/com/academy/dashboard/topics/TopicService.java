/**
 * 
 */
package com.academy.dashboard.topics;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kkpramod
 *
 */

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics()
	{
		return (List<Topic>) topicRepository.findAll();
	}

	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public String addTopic(Topic topic) {
		topicRepository.save(topic);
		return "Course has been added successfully";
	}

	public String updateTopic(Topic updated_topic, String id) {
		topicRepository.save(updated_topic);
		return "Course has been updated successfully";
		
	}

	public String deleteTopic(String id) {
		topicRepository.deleteById(id);
		return "Course has been deleted successfully";
		
	}
	 
}
