package org.singam.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "camel.component.hornetq")
public class HornetQComponentConfiguration {
	
    private String type = "queue";

    private String prefix = "queue.";
    
    
    private String host = "localhost";

    
    private int port = 5445;


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
}
