
package org.singam.boot;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationProperties;
import org.apache.camel.spring.boot.util.CamelPropertiesHelper;
import org.apache.camel.spring.boot.util.ConditionalOnCamelContextAndAutoConfigurationBeans;
import org.apache.camel.util.IntrospectionSupport;
import org.singam.camel.component.flume.FlumeComponent;
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
    FlumeComponentConfiguration.class})
public class FlumeComponentAutoConfiguration {
    @Autowired
    private CamelContext camelContext;
    @Autowired
    private FlumeComponentConfiguration configuration;
    
    @Lazy
    @Bean(name = "flume-component")
    @ConditionalOnMissingBean(FlumeComponent.class)
    public FlumeComponent configureSolrcloudComponent() throws Exception {
    	FlumeComponent flumeComponent = new FlumeComponent();
    	Map<String, Object> parameters = new HashMap<>();
        IntrospectionSupport.getProperties(configuration, parameters, null,
                false);
        CamelPropertiesHelper.setCamelProperties(camelContext, flumeComponent,
                parameters, false);
		return flumeComponent;
    	
    }
}
