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
			assignmentName = reader.getCellData("Assignee", "Assignment_Name", rowNum);
			assignmentType = reader.getCellData("Assignee", "Assignment_Type", rowNum);
			assignmentIdentifier = reader.getCellData("Assignee", "Assignment_Identifier", rowNum);
			assignmentEstimatedBegin = reader.getCellData("Assignee", "Estimated_Begin_Date", rowNum);
			assignmentEstimatedEnd = reader.getCellData("Assignee", "Estimated_End_Date", rowNum);
			assignmentActualBegin = reader.getCellData("Assignee", "Actual_Begin_Date", rowNum);
			assignmentHomeOrganization = reader.getCellData("Assignee", "Home_Organization", rowNum);
			assignmentPayCycle = reader.getCellData("Assignee", "Pay_Cycle", rowNum);
			assignmentWorkLocation = reader.getCellData("Assignee", "Work_Location", rowNum);
			assignmentTaxState = reader.getCellData("Assignee", "Tax_State", rowNum);
			policyName = reader.getCellData("Assignee", "Policy_Name", rowNum);
			policyFrom = reader.getCellData("Assignee", "From_Date", rowNum);
			policyTo = reader.getCellData("Assignee", "To_Date", rowNum);
			
			Object ob[] = {assigneeEffectiveDate , assigneeFirstName, assigneeSurname, assigneeSocialNumber, assigneeIdNumber, assigneeBirthDate, assigneeHomeCountry, assigneeHomeState, assignmentName, assignmentType, assignmentIdentifier, assignmentEstimatedBegin, assignmentEstimatedEnd, assignmentActualBegin, assignmentHomeOrganization, assignmentPayCycle, assignmentWorkLocation, assignmentTaxState, policyName, policyFrom, policyTo};
			data.add(ob);
			
		}
		return data;		
		
	}
	
	

}
