package org.singam.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "camel.component.topic")
public class TopicComponentConfiguration {
	
    private String polldelay = "1000";

	public String getPolldelay() {
		return polldelay;
	}

	public void setPolldelay(String polldelay) {
		this.polldelay = polldelay;
	}

    
}