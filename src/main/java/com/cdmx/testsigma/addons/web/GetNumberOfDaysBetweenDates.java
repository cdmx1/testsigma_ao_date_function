
/*Change Log: AUTO-829 | function to store the number of days between 2 dates | 15/11/23 */


package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.Result;
import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.RunTimeData;
import com.testsigma.sdk.annotation.TestData;
import lombok.Data;

import java.text.SimpleDateFormat;

import org.openqa.selenium.NoSuchElementException;

@Data
@Action(actionText = "Get Number of days between from Testdata1 to Testdata2 and store it in a runtime variable",
        description = "This addon calculates the number of days between the 'from' and 'to' dates (dd/MM/yyyy format) and stores the result in a runtime variable.",
        applicationType = ApplicationType.WEB)

public class GetNumberOfDaysBetweenDates extends WebAction 
{
	
    @TestData(reference = "Testdata1")
    private com.testsigma.sdk.TestData testData1;
 
    @TestData(reference = "Testdata2")
    private com.testsigma.sdk.TestData testData2;

    @TestData(reference = "variable")
    private com.testsigma.sdk.TestData runtimeVar;

    @RunTimeData
    private com.testsigma.sdk.RunTimeData runTimeData;

    @Override
    public Result execute() throws NoSuchElementException 
    {
    	
        //Your Awesome code starts here
        logger.info("Initiating execution");

        Result result = Result.SUCCESS;

        try
        {
        	String testdata = testData1.getValue().toString();
            String testdata1 = testData2.getValue().toString();

            java.util.Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(testdata);
            java.util.Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(testdata1);  
            //your custom code starts here
            long Difference_In_Time = date2.getTime() - date1.getTime();
         	long Difference_In_Days = Difference_In_Time / (1000 * 3600 * 24);
            int Result = Math.round(Difference_In_Days);
            //System.out.println(Result);
            
            runTimeData.setKey(runtimeVar.getValue().toString());
            runTimeData.setValue(String.valueOf(Result));

            System.out.println("Successfully calculated the difference between two dates " + Result + " and stored in a runtime variable => " + runtimeVar.getValue().toString());
            setSuccessMessage("Successfully calculated the difference between two dates " + Result + " and stored in a runtime variable => " + runtimeVar.getValue().toString());

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage().toString());
            setErrorMessage("Operation failed , the error message is ::::"+e.getMessage());
            result = Result.FAILED;
        }
        return result;
    }
}

