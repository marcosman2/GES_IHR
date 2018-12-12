package dataDriven;

import java.util.ArrayList;

import excelReader.Xls_Reader;

public class DataDriven {
	
	static Xls_Reader reader;
	public static String assigneeEffectiveDate;
	public static String assigneeFirstName;
	public static String assigneeSurname;
	public static String assigneeSocialNumber;
	public static String assigneeIdNumber;
	public static String assigneeBirthDate;
	public static String assigneeHomeCountry;
	public static String assigneeHomeState;
	public static String assignmentName;
	public static String assignmentType;
	public static String assignmentIdentifier;
	public static String assignmentEstimatedBegin;
	public static String assignmentEstimatedEnd;
	public static String assignmentActualBegin;
	public static String assignmentHomeOrganization;
	public static String assignmentPayCycle;
	public static String assignmentWorkLocation;
	public static String assignmentTaxState;
	public static String policyName;
	public static String policyFrom;
	public static String policyTo;
	public static String policy_Name;
	public static String policy_Currency;
	public static String policy_From;
	public static String policy_To;
	public static String policy_CovarsNumber;
	public static String policy_Covar1;
	public static String policy_Covar2;
	public static String policy_Covar3;
	public static String policy_Covar4;
	public static String policy_Covar5;
	public static String policy_Covar6;
	public static String policy_Covar7;
	public static String policy_Covar8;
	public static String policy_Covar9;
	public static String policy_Covar10;
	public static String compImportLegacyScenario;
	public static String compImportLegacyFile;
	public static String newCompImportScenario;
	public static String newCompImportFile;
	
	//PPT Variables
	
	public static String payPolicy_Name;
	public static String payPolicy_BD;
	public static String payPolicy_PL;
	public static String payPolicy_PLS;
	public static String payPolicy_Charge;
	public static String payPolicy_Social;
	public static String payPolicy_Hypo;
	public static String payPolicy_TET;
	public static String payPolicy_Variable1;
	public static String payPolicy_Variable2;
	public static String payPolicy_Variable3;
	public static String payPolicy_Variable4;
	public static String payPolicy_Variable5;
	public static String payPolicy_SourceType;
	public static Double payPolicy_Amount1;
	public static String payPolicy_HowStated1;
	public static Double payPolicy_Amount2;
	public static String payPolicy_HowStated2;
	public static Double payPolicy_Amount3;
	public static String payPolicy_HowStated3;
	public static Double payPolicy_Amount4;
	public static String payPolicy_HowStated4;
	public static Double payPolicy_Amount5;
	public static String payPolicy_HowStated5;
	public static String payPolicy_Element1;
	public static String payPolicy_Element2;
	public static String payPolicy_Element3;
	public static String payPolicy_Element4;
	public static String payPolicy_Element5;
	public static String payPolicy_Currency;
	public static String payPolicy_CurrencyIndicator;
	public static String payPolicy_VariableMapping1;
	public static String payPolicy_ElementMapping1;
	public static String payPolicy_UsageMapping1;
	public static String payPolicy_VariableMapping2;
	public static String payPolicy_ElementMapping2;
	public static String payPolicy_UsageMapping2;
	public static String payPolicy_VariableMapping3;
	public static String payPolicy_ElementMapping3;
	public static String payPolicy_UsageMapping3;
	public static String payPolicy_VariableMapping4;
	public static String payPolicy_ElementMapping4;
	public static String payPolicy_UsageMapping4;
	public static String payPolicy_VariableMapping5;
	public static String payPolicy_ElementMapping5;
	public static String payPolicy_UsageMapping5;
	
	
	//-----------------------------MÉTODOS PARA LEER LOS DATOS DE EXCEL---------------------------------------------------------
	
	//-------------------------------------Método para leer los datos de un Assignee-----------------------------------
	
	public static ArrayList<Object[]> dataReaderAssignee()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("Assignee");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			assigneeEffectiveDate = reader.getCellData("Assignee", "Effective_Date", rowNum);
			assigneeFirstName = reader.getCellData("Assignee", "First_Name", rowNum);
			assigneeSurname = reader.getCellData("Assignee", "Surname", rowNum);
			assigneeSocialNumber = reader.getCellData("Assignee", "Social_Number", rowNum);
			assigneeIdNumber = reader.getCellData("Assignee", "Id_Number", rowNum);
			assigneeBirthDate = reader.getCellData("Assignee", "Birth_Date", rowNum);
			assigneeHomeCountry = reader.getCellData("Assignee", "Home_Country", rowNum);
			assigneeHomeState = reader.getCellData("Assignee", "Home_State", rowNum);
			
			Object ob[] = {assigneeEffectiveDate , assigneeFirstName, assigneeSurname, assigneeSocialNumber, assigneeIdNumber, assigneeBirthDate, assigneeHomeCountry, assigneeHomeState};
			data.add(ob);
			
		}
		return data;		
	}
	
	//-------------------------------------Método para leer los datos de un Assignee Assignment-----------------------------------
	
		public static ArrayList<Object[]> dataReaderAssigneeAssignment()
		{
			ArrayList<Object[]> data = new ArrayList<Object[]>();
			try
			{
			reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			int rowCount = reader.getRowCount("AA");
			for (int rowNum = 2; rowNum<= rowCount; rowNum++)
			{
				
				assigneeEffectiveDate = reader.getCellData("AA", "Effective_Date", rowNum);
				assigneeFirstName = reader.getCellData("AA", "First_Name", rowNum);
				assigneeSurname = reader.getCellData("AA", "Surname", rowNum);
				assigneeSocialNumber = reader.getCellData("AA", "Social_Number", rowNum);
				assigneeIdNumber = reader.getCellData("AA", "Id_Number", rowNum);
				assigneeBirthDate = reader.getCellData("AA", "Birth_Date", rowNum);
				assigneeHomeCountry = reader.getCellData("AA", "Home_Country", rowNum);
				assigneeHomeState = reader.getCellData("AA", "Home_State", rowNum);
				assignmentName = reader.getCellData("AA", "Assignment_Name", rowNum);
				assignmentType = reader.getCellData("AA", "Assignment_Type", rowNum);
				assignmentIdentifier = reader.getCellData("AA", "Assignment_Identifier", rowNum);
				assignmentEstimatedBegin = reader.getCellData("AA", "Estimated_Begin_Date", rowNum);
				assignmentEstimatedEnd = reader.getCellData("AA", "Estimated_End_Date", rowNum);
				assignmentActualBegin = reader.getCellData("AAP", "Actual_Begin_Date", rowNum);
				assignmentHomeOrganization = reader.getCellData("AA", "Home_Organization", rowNum);
				assignmentPayCycle = reader.getCellData("AA", "Pay_Cycle", rowNum);
				assignmentWorkLocation = reader.getCellData("AA", "Work_Location", rowNum);
				assignmentTaxState = reader.getCellData("AA", "Tax_State", rowNum);
				
				Object ob[] = {assigneeEffectiveDate , assigneeFirstName, assigneeSurname, assigneeSocialNumber, assigneeIdNumber, assigneeBirthDate, assigneeHomeCountry, assigneeHomeState, assignmentName, assignmentType, assignmentIdentifier, assignmentEstimatedBegin, assignmentEstimatedEnd, assignmentActualBegin, assignmentHomeOrganization, assignmentPayCycle, assignmentWorkLocation, assignmentTaxState};
				data.add(ob);
				
			}
			return data;		
		}
	
	//-------------------------------------Método para leer los datos de un AA Policy-----------------------------------
	
	public static ArrayList<Object[]> dataReaderAssigneeAssignmentPolicy()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("AAPolicy");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			assigneeEffectiveDate = reader.getCellData("AAPolicy", "Effective_Date", rowNum);
			assigneeFirstName = reader.getCellData("AAPolicy", "First_Name", rowNum);
			assigneeSurname = reader.getCellData("AAPolicy", "Surname", rowNum);
			assigneeSocialNumber = reader.getCellData("AAPolicy", "Social_Number", rowNum);
			assigneeIdNumber = reader.getCellData("AAPolicy", "Id_Number", rowNum);
			assigneeBirthDate = reader.getCellData("AAPolicy", "Birth_Date", rowNum);
			assigneeHomeCountry = reader.getCellData("AAPolicy", "Home_Country", rowNum);
			assigneeHomeState = reader.getCellData("AAPolicy", "Home_State", rowNum);
			assignmentName = reader.getCellData("AAPolicy", "Assignment_Name", rowNum);
			assignmentType = reader.getCellData("AAPolicy", "Assignment_Type", rowNum);
			assignmentIdentifier = reader.getCellData("AAPolicy", "Assignment_Identifier", rowNum);
			assignmentEstimatedBegin = reader.getCellData("AAPolicy", "Estimated_Begin_Date", rowNum);
			assignmentEstimatedEnd = reader.getCellData("AAPolicy", "Estimated_End_Date", rowNum);
			assignmentActualBegin = reader.getCellData("AAPolicy", "Actual_Begin_Date", rowNum);
			assignmentHomeOrganization = reader.getCellData("AAPolicy", "Home_Organization", rowNum);
			assignmentPayCycle = reader.getCellData("AAPolicy", "Pay_Cycle", rowNum);
			assignmentWorkLocation = reader.getCellData("AAPolicy", "Work_Location", rowNum);
			assignmentTaxState = reader.getCellData("AAPolicy", "Tax_State", rowNum);
			policyName = reader.getCellData("AAPolicy", "Policy_Name", rowNum);
			policyFrom = reader.getCellData("AAPolicy", "From_Date", rowNum);
			policyTo = reader.getCellData("AAPolicy", "To_Date", rowNum);
			
			Object ob[] = {assigneeEffectiveDate , assigneeFirstName, assigneeSurname, assigneeSocialNumber, assigneeIdNumber, assigneeBirthDate, assigneeHomeCountry, assigneeHomeState, assignmentName, assignmentType, assignmentIdentifier, assignmentEstimatedBegin, assignmentEstimatedEnd, assignmentActualBegin, assignmentHomeOrganization, assignmentPayCycle, assignmentWorkLocation, assignmentTaxState, policyName, policyFrom, policyTo};
			data.add(ob);
			
		}
		return data;		
	}
	
	//---------------------------Método para leer los datos del Comp Import Legacy----------------------------------------
	
	public static ArrayList<Object[]> dataReaderCompImportLegacy()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("CompImportLegacy");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			compImportLegacyScenario = reader.getCellData("CompImportLegacy", "Scenario", rowNum);
			compImportLegacyFile = reader.getCellData("CompImportLegacy", "Test_File", rowNum);
			
			Object ob[] = {compImportLegacyScenario, compImportLegacyFile};
			data.add(ob);
			
		}
		return data;
	}
	
	//---------------------------Método para leer los datos de un Policy----------------------------------------
	
	public static ArrayList<Object[]> dataReaderPolicy()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("Policy");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			policy_Name = reader.getCellData("Policy", "Policy_Name", rowNum);
			policy_Currency = reader.getCellData("Policy", "Policy_Currency", rowNum);
			policy_From = reader.getCellData("Policy", "From_Date", rowNum);
			policy_To = reader.getCellData("Policy", "To_Date", rowNum);
			policy_CovarsNumber = reader.getCellData("Policy", "Covars_Number", rowNum);
			policy_Covar1 = reader.getCellData("Policy", "Covar1", rowNum);
			policy_Covar2 = reader.getCellData("Policy", "Covar2", rowNum);
			policy_Covar3 = reader.getCellData("Policy", "Covar3", rowNum);
			policy_Covar4 = reader.getCellData("Policy", "Covar4", rowNum);
			policy_Covar5 = reader.getCellData("Policy", "Covar5", rowNum);
			policy_Covar6 = reader.getCellData("Policy", "Covar6", rowNum);
			policy_Covar7 = reader.getCellData("Policy", "Covar7", rowNum);
			policy_Covar8 = reader.getCellData("Policy", "Covar8", rowNum);
			policy_Covar9 = reader.getCellData("Policy", "Covar9", rowNum);
			policy_Covar10 = reader.getCellData("Policy", "Covar10", rowNum);
			
			Object ob[] = {policy_Name, policy_Currency, policy_From, policy_To, policy_CovarsNumber, policy_Covar1, policy_Covar2, policy_Covar3, policy_Covar4, policy_Covar5, policy_Covar6, policy_Covar7, policy_Covar8, policy_Covar9, policy_Covar10};
			data.add(ob);
			
		}
		return data;
	}
	
	//---------------------------Método para leer los datos del New Comp Import----------------------------------------
	
	public static ArrayList<Object[]> dataReaderNewCompImport()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("NewCompImport");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			newCompImportScenario = reader.getCellData("NewCompImport", "Scenario", rowNum);
			newCompImportFile = reader.getCellData("NewCompImport", "Test_File", rowNum);
			
			Object ob[] = {newCompImportScenario, newCompImportFile};
			data.add(ob);
			
		}
		return data;
	}
	
	//--------------------------------Método para leer los datos del PPT-------------------------------------------------
	
	public static ArrayList<Object[]> dataReaderPayPolicyTemplate()
	{
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		try
		{
		reader = new Xls_Reader("C:\\Users\\mamanrique\\eclipse-workspace\\IHR\\src\\test\\java\\helpers\\IHR_Data.xlsx");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int rowCount = reader.getRowCount("PPT");
		for (int rowNum = 2; rowNum<= rowCount; rowNum++)
		{
			
			payPolicy_Name = reader.getCellData("PPT", "PPT_Name", rowNum);
			payPolicy_BD = reader.getCellData("PPT", "Begin_Date", rowNum);
			payPolicy_PL = reader.getCellData("PPT", "PL", rowNum);
			payPolicy_PLS = reader.getCellData("PPT", "PLS", rowNum);
			payPolicy_Charge = reader.getCellData("PPT", "Charge", rowNum);
			payPolicy_Social = reader.getCellData("PPT", "Social_Tax", rowNum);
			payPolicy_Hypo = reader.getCellData("PPT", "Hypo", rowNum);
			payPolicy_TET = reader.getCellData("PPT", "TET", rowNum);
			payPolicy_Variable1 = reader.getCellData("PPT", "Variable1", rowNum);
			payPolicy_Variable2 = reader.getCellData("PPT", "Variable2", rowNum);
			payPolicy_Variable3 = reader.getCellData("PPT", "Variable3", rowNum);
			payPolicy_Variable4 = reader.getCellData("PPT", "Variable4", rowNum);
			payPolicy_Variable5 = reader.getCellData("PPT", "Variable5", rowNum);
			payPolicy_SourceType = reader.getCellData("PPT", "Source_Type", rowNum);
			payPolicy_Amount1 = Double.parseDouble(reader.getCellData("PPT", "Amount1", rowNum));
			payPolicy_HowStated1 = reader.getCellData("PPT", "How_Stated1", rowNum);
			payPolicy_Amount2 = Double.parseDouble(reader.getCellData("PPT", "Amount2", rowNum));
			payPolicy_HowStated2 = reader.getCellData("PPT", "How_Stated2", rowNum);
			payPolicy_Amount3 = Double.parseDouble(reader.getCellData("PPT", "Amount3", rowNum));
			payPolicy_HowStated3 = reader.getCellData("PPT", "How_Stated3", rowNum);
			payPolicy_Amount4 = Double.parseDouble(reader.getCellData("PPT", "Amount4", rowNum));
			payPolicy_HowStated4 = reader.getCellData("PPT", "How_Stated4", rowNum);
			payPolicy_Amount5 = Double.parseDouble(reader.getCellData("PPT", "Amount5", rowNum));
			payPolicy_HowStated5 = reader.getCellData("PPT", "How_Stated5", rowNum);
			payPolicy_Element1 = reader.getCellData("PPT", "Element1", rowNum);
			payPolicy_Element2 = reader.getCellData("PPT", "Element2", rowNum);
			payPolicy_Element3 = reader.getCellData("PPT", "Element3", rowNum);
			payPolicy_Element4 = reader.getCellData("PPT", "Element4", rowNum);
			payPolicy_Element5 = reader.getCellData("PPT", "Element5", rowNum);
			payPolicy_Currency = reader.getCellData("PPT", "Currency", rowNum);
			payPolicy_CurrencyIndicator = reader.getCellData("PPT", "Currency_Indicator", rowNum);
			payPolicy_VariableMapping1 = reader.getCellData("PPT", "Variable_Mapping1", rowNum);
			payPolicy_ElementMapping1 = reader.getCellData("PPT", "Element_Mapping1", rowNum);
			payPolicy_UsageMapping1 = reader.getCellData("PPT", "Usage_Mapping1", rowNum);
			payPolicy_VariableMapping2 = reader.getCellData("PPT", "Variable_Mapping2", rowNum);
			payPolicy_ElementMapping2 = reader.getCellData("PPT", "Element_Mapping2", rowNum);
			payPolicy_UsageMapping2 = reader.getCellData("PPT", "Usage_Mapping2", rowNum);
			payPolicy_VariableMapping3 = reader.getCellData("PPT", "Variable_Mapping3", rowNum);
			payPolicy_ElementMapping3 = reader.getCellData("PPT", "Element_Mapping3", rowNum);
			payPolicy_UsageMapping3 = reader.getCellData("PPT", "Usage_Mapping3", rowNum);
			payPolicy_VariableMapping4 = reader.getCellData("PPT", "Variable_Mapping4", rowNum);
			payPolicy_ElementMapping4 = reader.getCellData("PPT", "Element_Mapping4", rowNum);
			payPolicy_UsageMapping4 = reader.getCellData("PPT", "Usage_Mapping4", rowNum);
			payPolicy_VariableMapping5 = reader.getCellData("PPT", "Variable_Mapping5", rowNum);
			payPolicy_ElementMapping5 = reader.getCellData("PPT", "Element_Mapping5", rowNum);
			payPolicy_UsageMapping5 = reader.getCellData("PPT", "Usage_Mapping5", rowNum);
			
			
			Object ob[] = {payPolicy_Name, payPolicy_BD, payPolicy_PL, payPolicy_PLS, payPolicy_Charge, payPolicy_Social, payPolicy_Hypo, payPolicy_TET, payPolicy_Variable1, payPolicy_Variable2, payPolicy_Variable3, payPolicy_Variable4, payPolicy_Variable5, payPolicy_SourceType, payPolicy_Amount1, payPolicy_HowStated1, payPolicy_Amount2, payPolicy_HowStated2, payPolicy_Amount3, payPolicy_HowStated3, payPolicy_Amount4, payPolicy_HowStated4, payPolicy_Amount5, payPolicy_HowStated5, payPolicy_Element1, payPolicy_Element2, payPolicy_Element3, payPolicy_Element4, payPolicy_Element5, payPolicy_Currency, payPolicy_CurrencyIndicator, payPolicy_VariableMapping1, payPolicy_ElementMapping1, payPolicy_UsageMapping1, payPolicy_VariableMapping2, payPolicy_ElementMapping2, payPolicy_UsageMapping2, payPolicy_VariableMapping3, payPolicy_ElementMapping3, payPolicy_UsageMapping3, payPolicy_VariableMapping4, payPolicy_ElementMapping4, payPolicy_UsageMapping4, payPolicy_VariableMapping5, payPolicy_ElementMapping5, payPolicy_UsageMapping5};
			data.add(ob);
			
		}
		return data;
		
		
		
		
		
		
		
		
	}
}
