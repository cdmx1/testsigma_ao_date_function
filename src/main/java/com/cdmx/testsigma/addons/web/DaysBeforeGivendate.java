
/*Change Log: AUTO-829 | function to store the date 'n' number of days before the given date | 15/11/23 */

package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.Result;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.RunTimeData;
import lombok.Data;
import org.openqa.selenium.NoSuchElementException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Data
@Action(actionText = "Store the date that is before the testdata1 number of days from the given testdata2 date in a runtime variable",
        description = "This addon will store the date in yyyy-MM-dd'T'HH:mm'Z' format that precedes the specified number of days before the given date in a runtime variable",
        applicationType = ApplicationType.WEB)
public class DaysBeforeGivendate extends WebAction {

  @TestData(reference = "testdata1")
  private com.testsigma.sdk.TestData testData1;
  
  @TestData(reference = "testdata2")
  private com.testsigma.sdk.TestData testData2;
  
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
    	logger.debug("number of days => " + testData1.getValue().toString());
    	logger.debug("date => " + testData2.getValue().toString());
    	
    	String var_past_date;
        int n = Integer.parseInt(testData1.getValue().toString());
        String testdata1 = testData2.getValue().toString();

        Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse(testdata1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.DATE, -n);
        Date yesterday = calendar.getTime();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        String strDate = dateFormat.format(yesterday);
        var_past_date = strDate;
       
       runTimeData.setKey(runtimeVar.getValue().toString());
       runTimeData.setValue(var_past_date);
       
       result = Result.SUCCESS;
       setSuccessMessage("successfully store the date "+ var_past_date + " which is before the specified number of days " + testData1.getValue().toString() + " from the given date " + testData2.getValue().toString() + " in a runtime variable");
    }
    catch (Exception e) 
    {
        result = com.testsigma.sdk.Result.FAILED;
        setErrorMessage(errorMessage);
	} 
    return result;
  }
}