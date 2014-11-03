package com.synisys.training.patterns.builder;

import com.synisys.training.patterns.builder.interfaces.Query;
import static  org.junit.Assert.*;
import org.junit.Test;

public class QueryBuilderTest {


	@Test
	public void testQueryBuilder() {
		Query query = QueryBuilder.newQuery();
		String result = query.select("ProjectID").from("Projects").getQueryString();
		assertEquals("SELECT ProjectID \n" +
					"FROM Projects "
				,result);

	}


	@Test
	public void testQueryBuilderWithWhere() {
		Query query = QueryBuilder.newQuery();
		String result = query.select("ProjectID").from("Projects").where("Project.ProjectId in (1,2,3)").getQueryString();

		assertEquals("SELECT ProjectID \n" +
					"FROM Projects \n" +
					"WHERE Project.ProjectId in (1,2,3)"
				,result);

	}

	@Test
	public void testQueryBuilderWithJoin() {
		Query query = QueryBuilder.newQuery();
		String result = query.select("ProjectID, Commitment_USD").from("Projects").join("DonorCommitments")
				.on("Project.ProjectId = DonorCommitments.ProjectId").where("Project.ProjectId in (1,2,3)").orderBy("Commitment_USD").getQueryString();

		assertEquals("SELECT ProjectID, Commitment_USD \n" +
				"FROM Projects JOIN DonorCommitments ON Project.ProjectId = DonorCommitments.ProjectId \n" +
				"WHERE Project.ProjectId in (1,2,3)\n" +
				"ORDER BY Commitment_USD"
				, result);

	}
}
