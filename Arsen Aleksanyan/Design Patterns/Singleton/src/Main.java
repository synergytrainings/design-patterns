import com.synisys.designpatterns.singleton.queries.QueryProvider;
import com.synisys.designpatterns.singleton.queries.SqlQueries;
import com.synisys.designpatterns.singleton.utils.DbType;


public class Main {
	public static final String LOAD_PRODUCTS = "loadProducts";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Inject
		DbType dbType = DbType.MSSQL;
		QueryProvider.initialize(dbType);
		
		QueryProvider queryProvider = QueryProvider.getInstance();
		SqlQueries queries = queryProvider.getQueries("/test.xml");
		String loadProductsQuery = queries.getQuery(LOAD_PRODUCTS);
		
		System.out.println(loadProductsQuery);
	}

}
