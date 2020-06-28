
package org.singam.boot;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationProperties;
import org.apache.camel.spring.boot.util.CamelPropertiesHelper;
import org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans;
import org.apache.camel.util.IntrospectionSupport;
import org.singam.camel.component.solr.cloud.SolrcloudComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Lazy;

@Conditional({ConditionalOnCamelContextAndAutoConfigurationBeans.class})
@AutoConfigureAfter(CamelAutoConfiguration.class)
@EnableConfigurationProperties({ComponentConfigurationProperties.class,
    SolrCloudComponentConfiguration.class})
public class SolrCloudComponentAutoConfiguration {
    @Autowired
    private CamelContext camelContext;
    @Autowired
    private SolrCloudComponentConfiguration configuration;
    
    @Lazy
    @Bean(name = "solrcloud-component")
    @ConditionalOnMissingBean(SolrcloudComponent.class)
    public SolrcloudComponent configureSolrcloudComponent() throws Exception {
    	SolrcloudComponent solrCloudComponent = new SolrcloudComponent();
    	Map<String, Object> parameters = new HashMap<>();
        IntrospectionSupport.getProperties(configuration, parameters, null,
                false);
        CamelPropertiesHelper.setCamelProperties(camelContext, solrCloudComponent,
                parameters, false);
		return solrCloudComponent;
    	
    }
}
