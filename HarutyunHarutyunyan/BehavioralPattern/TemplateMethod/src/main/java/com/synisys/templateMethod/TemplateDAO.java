package com.synisys.templateMethod;

import java.sql.SQLException;

public abstract class TemplateDAO implements DAO {

	public final int executeQuery(String query) {
		int result = 0;
		try (Transaction transaction = openTransaction()) {
			doSomeTask();
			result = executeQueryHelper(transaction, query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public abstract int executeQueryHelper(Transaction transaction, String query);

	public abstract void doSomeTask();
}
