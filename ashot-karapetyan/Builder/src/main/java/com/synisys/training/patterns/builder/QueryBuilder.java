package com.synisys.training.patterns.builder;

import com.google.common.base.Joiner;
import com.synisys.training.patterns.builder.interfaces.*;

public class QueryBuilder implements Query, Select, From, Join, Where,OrderBy {

	public static final String NEW_LINE = "\n";
	public static final String SEPARATOR = ",";
	private StringBuilder query = null;

	private QueryBuilder(){
		this.query = new StringBuilder();
	}

	public static Query newQuery(){
		return new QueryBuilder();
	}

	public Select select(String... columns) {
		append("SELECT ");
		append(Joiner.on(SEPARATOR).join(columns));
		append(" ");
		return this;
	}

	public From from(String... tables) {
		append(NEW_LINE);
		append("FROM ");
		append(Joiner.on(SEPARATOR).join(tables));
		append(" ");
		return this;
	}

	@Override
	public Join join(String table) {
		append("JOIN ");
		append(table);
		append(" ");
		return this;
	}

	@Override
	public From on(String condition) {
		append("ON ");
		append(condition);
		append(" ");
		return this;
	}

	public Where where(String condition) {
		append(NEW_LINE);
		append("WHERE ");
		append(condition);
		return this;
	}

	public OrderBy orderBy(String... columns) {
		append(NEW_LINE);
		append("ORDER BY ");
		append(Joiner.on(SEPARATOR).join(columns));
		return this;
	}

	public String getQueryString() {
		return this.query.toString();
	}

	private void append(String str){
		this.query.append(str);
	}



}
