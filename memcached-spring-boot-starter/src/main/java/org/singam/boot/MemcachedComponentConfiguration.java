package org.singam.boot;

import org.singam.camel.component.memcached.MemcachedOperations;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "camel.component.memcached")
public class MemcachedComponentConfiguration {
	private String host = "127.0.0.1";
    private int port = 11211;
    private String memcachedDefaultOperation = MemcachedOperations.MEMCACHED_GET;
    private String memcachedKey = null;
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
	public String getMemcachedDefaultOperation() {
		return memcachedDefaultOperation;
	}
	public void setMemcachedDefaultOperation(String memcachedDefaultOperation) {
		this.memcachedDefaultOperation = memcachedDefaultOperation;
	}
	public String getMemcachedKey() {
		return memcachedKey;
	}
	public void setMemcachedKey(String memcachedKey) {
		this.memcachedKey = memcachedKey;
	}
    
    
}
