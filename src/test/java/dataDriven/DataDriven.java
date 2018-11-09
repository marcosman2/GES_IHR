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
	
}
