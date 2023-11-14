
/*Change Log: AUTO-829 | function to change the date format | 14/11/23 */

package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.RunTimeData;
import lombok.Data;
import org.openqa.selenium.NoSuchElementException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Action(actionText = "Convert the date var_date having the format as var_current_format and the desired format required is var_desired_format and store the new date in the variable var_new_date",
        
        description = "changing the date to the new date format",
        applicationType = ApplicationType.WEB)
public class ChangeDateFormat extends WebAction 
{

  @TestData(reference = "var_date")
  private com.testsigma.sdk.TestData currentDate;

  @TestData(reference = "var_current_format", allowedValues = {"yyyy-MM-dd", "dd-MM-yyyy", "MM-dd-yyyy", "dd/MM/yyyy", "MM/dd/yyyy", "yyyy/MM/dd" })
  private com.testsigma.sdk.TestData currentFormat;

  @TestData(reference = "var_desired_format", allowedValues = {"yyyy-MM-dd", "dd-MM-yyyy", "MM-dd-yyyy", "dd/MM/yyyy", "MM/dd/yyyy", "yyyy/MM/dd" })
  private com.testsigma.sdk.TestData desiredFormat;

  @TestData(reference = "var_new_date")
  private com.testsigma.sdk.TestData newDate;
  /*@Element(reference = "element-locator")
  private com.testsigma.sdk.Element element;*/
  @RunTimeData
  private com.testsigma.sdk.RunTimeData runTimeData;

  @Override
  public com.testsigma.sdk.Result execute() throws NoSuchElementException {
    // Try use of run time data
    com.testsigma.sdk.Result result = com.testsigma.sdk.Result.SUCCESS;
    logger.info("Initiating execution");
    
    /*logger.debug("element locator with : "+ this.element.getValue() +" by:"+ this.element.getBy() + ", test-data: "+ this.testData.getValue());*/

    String originalDateString = currentDate.getValue().toString();
    String originalDateFormat = currentFormat.getValue().toString();

    // Define the desired output date format
    String desiredDateFormat = desiredFormat.getValue().toString();
    String formattedDate = null;
try {
    // Create a SimpleDateFormat object for the original format
    SimpleDateFormat originalFormat = new SimpleDateFormat(originalDateFormat);

    // Parse the original date string into a Date object
    Date date = originalFormat.parse(originalDateString);

    // Create a SimpleDateFormat object for the desired format
    SimpleDateFormat desiredFormat = new SimpleDateFormat(desiredDateFormat);

    // Format the date into the desired format
    formattedDate = desiredFormat.format(date);
    } catch (ParseException e) {
    e.printStackTrace();
}


    runTimeData = new com.testsigma.sdk.RunTimeData();
    runTimeData.setValue( formattedDate );
    runTimeData.setKey(newDate.getValue().toString());
    setSuccessMessage("Successfully stored "+ formattedDate +" into :: "+newDate.getValue());
    return result;
  }
}