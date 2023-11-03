package com.cdmx.testsigma.addons.web;

import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.RunTimeData;
import lombok.Data;
import org.openqa.selenium.NoSuchElementException;
import java.util.HashMap;
import java.util.Map;

@Data
@Action(actionText = "Get the country_name from the user and store the corresponding Country Code in country_code variable",
        description = "Get a Country code from a country name that was provided by the User and store in run time data",
        applicationType = ApplicationType.WEB)
public class GetCountryCodeFromCountryName extends WebAction {

  @TestData(reference = "country_code")
  private com.testsigma.sdk.TestData tempCountryCode;
  @TestData(reference = "country_name")
  private com.testsigma.sdk.TestData tempCountryName;
 /*  @Element(reference = "element-locator")
  private com.testsigma.sdk.Element element; */
  @RunTimeData
  private com.testsigma.sdk.RunTimeData runTimeData;

  @Override
  public com.testsigma.sdk.Result execute() throws NoSuchElementException {
    // Try use of run time data
    com.testsigma.sdk.Result result = com.testsigma.sdk.Result.SUCCESS;
    logger.info("Initiating execution");
    /* logger.debug("element locator with : "+ this.element.getValue() +" by:"+ this.element.getBy() + ", test-data: "+ this.testData.getValue());
    WebElement webElement = element.getElement(); */


    //list of countries and their corresponding code 
    Map<String, String> countryNamesToCodes = new HashMap<>();
      countryNamesToCodes.put("afghanistan", "AFG");
      countryNamesToCodes.put("albania", "ALB");
      countryNamesToCodes.put("algeria", "DZA");
      countryNamesToCodes.put("andorra", "AND");
      countryNamesToCodes.put("angola", "AGO");
      countryNamesToCodes.put("antigua and barbuda", "ATG");
      countryNamesToCodes.put("argentina", "ARG");
      countryNamesToCodes.put("armenia", "ARM");
      countryNamesToCodes.put("australia", "AUS");
      countryNamesToCodes.put("austria", "AUT");
      countryNamesToCodes.put("azerbaijan", "AZE");
      countryNamesToCodes.put("bahamas", "BHS");
      countryNamesToCodes.put("bahrain", "BHR");
      countryNamesToCodes.put("bangladesh", "BGD");
      countryNamesToCodes.put("barbados", "BRB");
      countryNamesToCodes.put("belarus", "BLR");
      countryNamesToCodes.put("belgium", "BEL");
      countryNamesToCodes.put("belize", "BLZ");
      countryNamesToCodes.put("benin", "BEN");
      countryNamesToCodes.put("bhutan", "BTN");
      countryNamesToCodes.put("bolivia", "BOL");
      countryNamesToCodes.put("bosnia and herzegovina", "BIH");
      countryNamesToCodes.put("botswana", "BWA");
      countryNamesToCodes.put("brazil", "BRA");
      countryNamesToCodes.put("brunei", "BRN");
      countryNamesToCodes.put("bulgaria", "BGR");
      countryNamesToCodes.put("burkina faso", "BFA");
      countryNamesToCodes.put("burundi", "BDI");
      countryNamesToCodes.put("cabo verde", "CPV");
      countryNamesToCodes.put("cambodia", "KHM");
      countryNamesToCodes.put("cameroon", "CMR");
      countryNamesToCodes.put("canada", "CAN");
      countryNamesToCodes.put("central african republic", "CAF");
      countryNamesToCodes.put("chad", "TCD");
      countryNamesToCodes.put("chile", "CHL");
      countryNamesToCodes.put("china", "CHN");
      countryNamesToCodes.put("colombia", "COL");
      countryNamesToCodes.put("comoros", "COM");
      countryNamesToCodes.put("congo (congo-brazzaville)", "COG");
      countryNamesToCodes.put("congo, democratic republic of the (congo-kinshasa)", "COD");
      countryNamesToCodes.put("costa rica", "CRI");
      countryNamesToCodes.put("croatia", "HRV");
      countryNamesToCodes.put("cuba", "CUB");
      countryNamesToCodes.put("cyprus", "CYP");
      countryNamesToCodes.put("czechia (czech republic)", "CZE");
      countryNamesToCodes.put("denmark", "DNK");
      countryNamesToCodes.put("djibouti", "DJI");
      countryNamesToCodes.put("dominica", "DMA");
      countryNamesToCodes.put("dominican republic", "DOM");
      countryNamesToCodes.put("ecuador", "ECU");
      countryNamesToCodes.put("egypt", "EGY");
      countryNamesToCodes.put("el salvador", "SLV");
      countryNamesToCodes.put("equatorial guinea", "GNQ");
      countryNamesToCodes.put("eritrea", "ERI");
      countryNamesToCodes.put("estonia", "EST");
      countryNamesToCodes.put("eswatini", "SWZ");
      countryNamesToCodes.put("ethiopia", "ETH");
      countryNamesToCodes.put("fiji", "FJI");
      countryNamesToCodes.put("finland", "FIN");
      countryNamesToCodes.put("france", "FRA");
      countryNamesToCodes.put("gabon", "GAB");
      countryNamesToCodes.put("gambia", "GMB");
      countryNamesToCodes.put("georgia", "GEO");
      countryNamesToCodes.put("germany", "DEU");
      countryNamesToCodes.put("ghana", "GHA");
      countryNamesToCodes.put("greece", "GRC");
      countryNamesToCodes.put("grenada", "GRD");
      countryNamesToCodes.put("guatemala", "GTM");
      countryNamesToCodes.put("guinea", "GIN");
      countryNamesToCodes.put("guinea-bissau", "GNB");
      countryNamesToCodes.put("guyana", "GUY");
      countryNamesToCodes.put("haiti", "HTI");
      countryNamesToCodes.put("holy see", "VAT");
      countryNamesToCodes.put("honduras", "HND");
      countryNamesToCodes.put("hungary", "HUN");
      countryNamesToCodes.put("iceland", "ISL");
      countryNamesToCodes.put("india", "IND");
      countryNamesToCodes.put("indonesia", "IDN");
      countryNamesToCodes.put("iran", "IRN");
      countryNamesToCodes.put("iraq", "IRQ");
      countryNamesToCodes.put("ireland", "IRL");
      countryNamesToCodes.put("israel", "ISR");
      countryNamesToCodes.put("italy", "ITA");
      countryNamesToCodes.put("ivory coast", "CIV");
      countryNamesToCodes.put("jamaica", "JAM");
      countryNamesToCodes.put("japan", "JPN");
      countryNamesToCodes.put("jordan", "JOR");
      countryNamesToCodes.put("kazakhstan", "KAZ");
      countryNamesToCodes.put("kenya", "KEN");
      countryNamesToCodes.put("kiribati", "KIR");
      countryNamesToCodes.put("kuwait", "KWT");
      countryNamesToCodes.put("kyrgyzstan", "KGZ");
      countryNamesToCodes.put("laos", "LAO");
      countryNamesToCodes.put("latvia", "LVA");
      countryNamesToCodes.put("lebanon", "LBN");
      countryNamesToCodes.put("lesotho", "LSO");
      countryNamesToCodes.put("liberia", "LBR");
      countryNamesToCodes.put("libya", "LBY");
      countryNamesToCodes.put("liechtenstein", "LIE");
      countryNamesToCodes.put("lithuania", "LTU");
      countryNamesToCodes.put("luxembourg", "LUX");
      countryNamesToCodes.put("madagascar", "MDG");
      countryNamesToCodes.put("malawi", "MWI");
      countryNamesToCodes.put("malaysia", "MYS");
      countryNamesToCodes.put("maldives", "MDV");
      countryNamesToCodes.put("mali", "MLI");
      countryNamesToCodes.put("malta", "MLT");
      countryNamesToCodes.put("marshall islands", "MHL");
      countryNamesToCodes.put("mauritania", "MRT");
      countryNamesToCodes.put("mauritius", "MUS");
      countryNamesToCodes.put("mexico", "MEX");
      countryNamesToCodes.put("micronesia", "FSM");
      countryNamesToCodes.put("monaco", "MCO");
      countryNamesToCodes.put("mongolia", "MNG");
      countryNamesToCodes.put("montenegro", "MNE");
      countryNamesToCodes.put("morocco", "MAR");
      countryNamesToCodes.put("mozambique", "MOZ");
      countryNamesToCodes.put("myanmar", "MMR");
      countryNamesToCodes.put("namibia", "NAM");
      countryNamesToCodes.put("nauru", "NRU");
      countryNamesToCodes.put("nepal", "NPL");
      countryNamesToCodes.put("netherlands", "NLD");
      countryNamesToCodes.put("new zealand", "NZL");
      countryNamesToCodes.put("nicaragua", "NIC");
      countryNamesToCodes.put("niger", "NER");
      countryNamesToCodes.put("nigeria", "NGA");
      countryNamesToCodes.put("north korea", "PRK");
      countryNamesToCodes.put("north macedonia (formerly Macedonia)", "MKD");
      countryNamesToCodes.put("norway", "NOR");
      countryNamesToCodes.put("oman", "OMN");
      countryNamesToCodes.put("pakistan", "PAK");
      countryNamesToCodes.put("palau", "PLW");
      countryNamesToCodes.put("palestine State", "PSE");
      countryNamesToCodes.put("panama", "PAN");
      countryNamesToCodes.put("papua new guinea", "PNG");
      countryNamesToCodes.put("paraguay", "PRY");
      countryNamesToCodes.put("peru", "PER");
      countryNamesToCodes.put("philippines", "PHL");
      countryNamesToCodes.put("poland", "POL");
      countryNamesToCodes.put("portugal", "PRT");
      countryNamesToCodes.put("qatar", "QAT");
      countryNamesToCodes.put("romania", "ROU");
      countryNamesToCodes.put("russia", "RUS");
      countryNamesToCodes.put("rwanda", "RWA");
      countryNamesToCodes.put("saint kitts and nevis", "KNA");
      countryNamesToCodes.put("saint lucia", "LCA");
      countryNamesToCodes.put("saint vincent and the grenadines", "VCT");
      countryNamesToCodes.put("samoa", "WSM");
      countryNamesToCodes.put("san marino", "SMR");
      countryNamesToCodes.put("sao tome and principe", "STP");
      countryNamesToCodes.put("saudi arabia", "SAU");
      countryNamesToCodes.put("senegal", "SEN");
      countryNamesToCodes.put("serbia", "SRB");
      countryNamesToCodes.put("seychelles", "SYC");
      countryNamesToCodes.put("sierra leone", "SLE");
      countryNamesToCodes.put("singapore", "SGP");
      countryNamesToCodes.put("slovakia", "SVK");
      countryNamesToCodes.put("slovenia", "SVN");
      countryNamesToCodes.put("solomon islands", "SLB");
      countryNamesToCodes.put("somalia", "SOM");
      countryNamesToCodes.put("south africa", "ZAF");
      countryNamesToCodes.put("south korea", "KOR");
      countryNamesToCodes.put("south sudan", "SSD");
      countryNamesToCodes.put("spain", "ESP");
      countryNamesToCodes.put("sri lanka", "LKA");
      countryNamesToCodes.put("sudan", "SDN");
      countryNamesToCodes.put("suriname", "SUR");
      countryNamesToCodes.put("sweden", "SWE");
      countryNamesToCodes.put("switzerland", "CHE");
      countryNamesToCodes.put("syria", "SYR");
      countryNamesToCodes.put("tajikistan", "TJK");
      countryNamesToCodes.put("tanzania", "TZA");
      countryNamesToCodes.put("thailand", "THA");
      countryNamesToCodes.put("timor-leste (east timor)", "TLS");
      countryNamesToCodes.put("togo", "TGO");
      countryNamesToCodes.put("tonga", "TON");
      countryNamesToCodes.put("trinidad and tobago", "TTO");
      countryNamesToCodes.put("tunisia", "TUN");
      countryNamesToCodes.put("turkey", "TUR");
      countryNamesToCodes.put("turkmenistan", "TKM");
      countryNamesToCodes.put("tuvalu", "TUV");
      countryNamesToCodes.put("uganda", "UGA");
      countryNamesToCodes.put("ukraine", "UKR");
      countryNamesToCodes.put("united arab emirates", "ARE");
      countryNamesToCodes.put("united kingdom", "GBR");
      countryNamesToCodes.put("uruguay", "URY");
      countryNamesToCodes.put("uzbekistan", "UZB");
      countryNamesToCodes.put("vanuatu", "VUT");
      countryNamesToCodes.put("venezuela", "VEN");
      countryNamesToCodes.put("vietnam", "VNM");
      countryNamesToCodes.put("yemen", "YEM");
      countryNamesToCodes.put("zambia", "ZMB");
      countryNamesToCodes.put("zimbabwe", "ZWE");





    String countryName = tempCountryName.getValue().toString();
    countryName = countryName.trim().toLowerCase();
    String countryCode = countryNamesToCodes.get(countryName);



    runTimeData = new com.testsigma.sdk.RunTimeData();
    runTimeData.setValue(countryCode);
    runTimeData.setKey(tempCountryCode.getValue().toString());
    setSuccessMessage("Successfully stored "+ countryCode +" into :: "+tempCountryCode.getValue());
    return result;
  }
}