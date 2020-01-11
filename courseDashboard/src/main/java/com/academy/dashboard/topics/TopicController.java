/**
 * 
 */
package com.academy.dashboard.topics;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author kkpramod
 *
 */

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public String addTopic(@RequestBody Topic topic)
	{
		String message = topicService.addTopic(topic);
		return message;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public String updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		String message = topicService.updateTopic(topic,id);
		return message;
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public String deleteTopic(@PathVariable String id)
	{
		String message = topicService.deleteTopic(id);
		return message;
	}
	
	
	
}
