package com.data.structure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.data.structure.linkedList")
public class DsConfig {
	
	@Bean (name = "nodeObject")
    public ListNode listNode() {
        return new ListNode();
    }
	
	

}
