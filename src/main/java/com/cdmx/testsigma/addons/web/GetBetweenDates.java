
/*Change Log: AUTO-829 | function to store random date between date1 and date2 | 15/11/23 */


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
import java.util.concurrent.ThreadLocalRandom;

@Data
@Action(actionText = "Generate the random date between From testdata1 and two testdata2 and store in a runtime variable",
        description = "This addon will generate the random date between two dates in yyyy-MM-dd'T'HH:mm'Z' format and store in a runtime variable",
        applicationType = ApplicationType.WEB)
public class GetBetweenDates extends WebAction {

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
    	logger.debug("From date => " + testData1.getValue().toString());
    	logger.debug("To date => " + testData2.getValue().toString());
    	
    	String testdata = testData1.getValue().toString();
        String testdata1 = testData2.getValue().toString();
        String var_between_date;
        Date date1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse(testdata);
        Date date2=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'").parse(testdata1);  
        //your custom code starts here
     	 Date randomDate = new Date(ThreadLocalRandom.current().nextLong(date1.getTime(), date2.getTime()));
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");  
        String strDate = dateFormat.format(randomDate);  
        var_between_date = strDate;
       
       runTimeData.setKey(runtimeVar.getValue().toString());
       runTimeData.setValue(var_between_date);
       
       result = Result.SUCCESS;
       setSuccessMessage("successfully generated the date "+ var_between_date + " between given two given dates and stored in a runtime variable " + runtimeVar.getValue().toString());
    }
    catch (Exception e) 
    {
        result = com.testsigma.sdk.Result.FAILED;
        setErrorMessage(errorMessage);
	} 
    return result;
  }
}