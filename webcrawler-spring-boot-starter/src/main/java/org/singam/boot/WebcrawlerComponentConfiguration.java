package org.singam.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "camel.component.webcrawler")
public class WebcrawlerComponentConfiguration {
    private int numCrawlers = 3;
    
    private int batchSize = 10;
    
    private String seed;
    
    private String filterPattern;
    
    private String storageFolder;

	public int getNumCrawlers() {
		return numCrawlers;
	}

	public void setNumCrawlers(int numCrawlers) {
		this.numCrawlers = numCrawlers;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	public String getFilterPattern() {
		return filterPattern;
	}

	public void setFilterPattern(String filterPattern) {
		this.filterPattern = filterPattern;
	}

	public String getStorageFolder() {
		return storageFolder;
	}

	public void setStorageFolder(String storageFolder) {
		this.storageFolder = storageFolder;
	}
    
}
