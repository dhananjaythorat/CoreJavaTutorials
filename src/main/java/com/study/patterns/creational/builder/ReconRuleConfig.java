package com.study.patterns.creational.builder;

public class ReconRuleConfig {
	
	long id;
	String ruleName;
	String srcColumnName;
	String trgColumnName;
	
	int tolerance;
	String filter;
	int rangeId;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getSrcColumnName() {
		return srcColumnName;
	}
	public void setSrcColumnName(String srcColumnName) {
		this.srcColumnName = srcColumnName;
	}
	public String getTrgColumnName() {
		return trgColumnName;
	}
	public void setTrgColumnName(String trgColumnName) {
		this.trgColumnName = trgColumnName;
	}
	public int getTolerance() {
		return tolerance;
	}
	public void setTolerance(int tolerance) {
		this.tolerance = tolerance;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public int getRangeId() {
		return rangeId;
	}
	public void setRangeId(int rangeId) {
		this.rangeId = rangeId;
	}
	
	private ReconRuleConfig(ReconRuleConfigBuilder builder) {
		this.ruleName = builder.ruleName;
		this.id = builder.id;
		this.srcColumnName = builder.srcColumnName;
		this.trgColumnName = builder.trgColumnName;
		this.tolerance = builder.tolerance;
		this.filter = builder.filter;
		this.rangeId = builder.rangeId;
	}
	
	public static class ReconRuleConfigBuilder{
		
		long id;
		String ruleName;
		String srcColumnName;
		String trgColumnName;
		
		int tolerance;
		String filter;
		int rangeId;
		
		public ReconRuleConfigBuilder(long id,String ruleName,String srcColumnName,String trgColumnName) {
			this.id = id;
			this.ruleName = ruleName;
			this.srcColumnName = srcColumnName;
			this.trgColumnName = trgColumnName;
		}
		
		public ReconRuleConfigBuilder setTolerance(int tolerance) {
			this.tolerance = tolerance;
			return this;
		}

		public ReconRuleConfigBuilder setFilter(String filter) {
			this.filter = filter;
			return this;
		}
		
		public ReconRuleConfigBuilder setRangeId(int rangeId) {
			this.rangeId = rangeId;
			return this;
		}
		
		public ReconRuleConfig build() {
			return new ReconRuleConfig(this);
		}
	}

	@Override
	public String toString() {
		return "ReconRuleConfig [id=" + id + ", ruleName=" + ruleName + ", srcColumnName=" + srcColumnName
				+ ", trgColumnName=" + trgColumnName + ", tolerance=" + tolerance + ", filter=" + filter + ", rangeId="
				+ rangeId + "]";
	}
	
}
