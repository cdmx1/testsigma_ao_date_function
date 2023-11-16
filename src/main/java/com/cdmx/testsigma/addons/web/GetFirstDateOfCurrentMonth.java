
/*Change Log: AUTO-829 | function to store the first  date of the current month | 15/11/23 */


package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.Result;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.RunTimeData;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.NoSuchElementException;

@Data
@Action(actionText = "Generate the first date of the current month and store in a runtime variable",
        description = "This addon will generate and store first date of the current month in a runtime variable",
        applicationType = ApplicationType.WEB)
public class GetFirstDateOfCurrentMonth extends WebAction {
  
  @TestData(reference = "variable")
  private com.testsigma.sdk.TestData runtimeVar;
  
  @RunTimeData
  private com.testsigma.sdk.RunTimeData runTimeData;

  @Override
  public com.testsigma.sdk.Result execute() throws NoSuchElementException {
    //Your Awesome code starts here
    logger.info("Initiating execution");
    com.testsigma.sdk.Result result = com.testsigma.sdk.Result.SUCCESS;
    try 
    {
    	
    	String var_current_month_first_date; 
        //your custom code starts here
         LocalDateTime firstDay = LocalDateTime.now().withDayOfMonth(1);
         
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm'Z'");
         String currentFirstDate = firstDay.format(formatter);
         LocalDateTime parsedDate = LocalDateTime.parse(currentFirstDate, formatter);
        //your custom code ends here
         var_current_month_first_date=currentFirstDate;
       
		runTimeData.setKey(runtimeVar.getValue().toString());
		runTimeData.setValue(var_current_month_first_date);
       
       result = Result.SUCCESS;
       setSuccessMessage("Successfully generated the first date of the current month " + var_current_month_first_date + " and store in runtime varibale " + runtimeVar.getValue().toString());
    }
    catch (Exception e) 
    {
        result = com.testsigma.sdk.Result.FAILED;
        setErrorMessage(errorMessage);
	} 
    return result;
  }
}