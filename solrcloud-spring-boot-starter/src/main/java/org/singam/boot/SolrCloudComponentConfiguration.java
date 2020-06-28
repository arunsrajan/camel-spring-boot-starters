package org.singam.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "camel.component.solrcloud")
public class SolrCloudComponentConfiguration {
	public String solrOperation;
	public boolean enabled;
	public String host;
	public String port;
	public String collectionName;
	public String shardName;
	
	public String getSolrOperation() {
		return solrOperation;
	}
	public void setSolrOperation(String solrOperation) {
		this.solrOperation = solrOperation;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		this.collectionName = collectionName;
	}
	public String getShardName() {
		return shardName;
	}
	public void setShardName(String shardName) {
		this.shardName = shardName;
	}
	
	
}
