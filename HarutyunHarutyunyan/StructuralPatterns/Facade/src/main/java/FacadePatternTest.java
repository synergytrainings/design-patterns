import java.sql.Connection;

import com.synisys.facade.FacadeImporter;
import com.synisys.facade.MySqlImporter;
import com.synisys.facade.OracleImporter;

public class FacadePatternTest {

	public static void main(String[] args) {
		String filePath = "/";

		// import Excel to MySql DB and XMl to Oracle DB without using Facade
		Connection con = MySqlImporter.getMySqlDBConnection();
		MySqlImporter mySqlHelper = new MySqlImporter();
		mySqlHelper.importExceltoMySqlDB(filePath, con);

		Connection con1 = OracleImporter.getOracleDBConnection();
		OracleImporter oracleHelper = new OracleImporter();
		oracleHelper.importXMLtoOracleDB(filePath, con1);

		// import Excel to MySql DB and XMl to Oracle DB using Facade
		FacadeImporter.importFile(FacadeImporter.DBTypes.MYSQL,
				FacadeImporter.ReportTypes.EXCEL, filePath);
		FacadeImporter.importFile(FacadeImporter.DBTypes.ORACLE,
				FacadeImporter.ReportTypes.XML, filePath);

	}

}