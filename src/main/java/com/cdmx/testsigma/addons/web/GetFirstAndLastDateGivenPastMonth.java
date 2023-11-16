
/*Change Log: AUTO-829 | function to store the first and last date of a month 'n' number of months away from the current month | 15/11/23 */


package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.Result;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.RunTimeData;
import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.NoSuchElementException;

@Data
@Action(actionText = "Generate and store the first and last dates of the preceding number of month in a runtime variable1 and variable2",
        description = "This addon will Generate the first and last dates of the month (yyyy-MM-dd'T'HH:mm'Z' format) preceding the specified number of months from the current month and store them in a runtime variable",
        applicationType = ApplicationType.WEB)
public class GetFirstAndLastDateGivenPastMonth extends WebAction {
	
	@TestData(reference = "number")
	private com.testsigma.sdk.TestData testData;
  
	@TestData(reference = "variable1")
	private com.testsigma.sdk.TestData runtimeVar1;
	
	@TestData(reference = "variable2")
	private com.testsigma.sdk.TestData runtimeVar2;
  
	@RunTimeData
	private com.testsigma.sdk.RunTimeData runTimeData;

  @Override
  public com.testsigma.sdk.Result execute() throws NoSuchElementException {
    //Your Awesome code starts here
    logger.info("Initiating execution");
    com.testsigma.sdk.Result result = com.testsigma.sdk.Result.SUCCESS;
    try 
    {
    	
    	 String var_past_month_first_date;
		 String testdata = testData.getValue().toString();
         int n=Integer.parseInt(testdata);  
      	 Calendar aCalendar = Calendar.getInstance();
         // add -1 month to current month
         aCalendar.add(Calendar.MONTH, -n);
         // set DATE to 1, so first date of previous month
         aCalendar.set(Calendar.DATE, 1);

         java.util.Date firstDateOfPreviousMonth = aCalendar.getTime();
         
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");  
         String theFirstDateOfPreviousMonth = dateFormat.format(firstDateOfPreviousMonth);  
         var_past_month_first_date = theFirstDateOfPreviousMonth;
         
         // set actual maximum date of previous month
         aCalendar.set(Calendar.DATE,     aCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
         //read it
         java.util.Date lastDateOfPreviousMonth = aCalendar.getTime();
      
         String theLastDateOfPreviousMonth = dateFormat.format(lastDateOfPreviousMonth);  
         String var_past_month_last_date = theLastDateOfPreviousMonth;
         
         //System.out.println("First data of last month is " + var_past_month_first_date);
        //System.out.println("Last data of last month is " + var_past_month_last_date);
       
		runTimeData.setKey(runtimeVar1.getValue().toString());
		runTimeData.setValue(var_past_month_first_date);
		
		runTimeData.setKey(runtimeVar2.getValue().toString());
		runTimeData.setValue(var_past_month_last_date);
       
       result = Result.SUCCESS;
       setSuccessMessage("Successfully generated the first date " + var_past_month_first_date + " and last date " + var_past_month_last_date + " of Past month and stored in runtime variables");
    }
    catch (Exception e) 
    {
        result = com.testsigma.sdk.Result.FAILED;
        setErrorMessage(errorMessage);
	} 
    return result;
  }
}