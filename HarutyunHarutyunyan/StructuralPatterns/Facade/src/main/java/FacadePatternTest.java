import java.sql.Connection;

import com.synisys.facade.FacadeImporter;
import com.synisys.facade.MySqlImporter;
import com.synisys.facade.OracleImporter;

public class FacadePatternTest {

	public static void main(String[] args) {
		String filePath = "/";

		// import Excel to MySql DB and XMl to Oracle DB without using Facade
		Connection con = MySqlImporter.getMySqlDBConnection();
		MySqlImporter mySqlImporter = new MySqlImporter();
		mySqlImporter.importExceltoMySqlDB(filePath, con);

		Connection con1 = OracleImporter.getOracleDBConnection();
		OracleImporter oracleImporter = new OracleImporter();
		oracleImporter.importXMLtoOracleDB(filePath, con1);

		// import Excel to MySql DB and XMl to Oracle DB using Facade
		FacadeImporter.importFile(FacadeImporter.DBTypes.MYSQL,
				FacadeImporter.FileTypes.EXCEL, filePath);
		FacadeImporter.importFile(FacadeImporter.DBTypes.ORACLE,
				FacadeImporter.FileTypes.XML, filePath);

	}

}