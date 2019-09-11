package com.study.patterns.creational.builder;

import com.study.patterns.creational.builder.ReconRuleConfig.ReconRuleConfigBuilder;

public class Client {

	public static void main(String[] args) {

		ReconRuleConfigBuilder builder = new ReconRuleConfigBuilder(202,"Number Compare","bal","savbal");
		builder.setTolerance(2).setRangeId(1001).setFilter("acc_type='S'");
		
		ReconRuleConfig ruleConfig = builder.build();
		
		System.out.println(ruleConfig);
		
	}

}
