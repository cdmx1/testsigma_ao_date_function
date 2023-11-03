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
@Action(actionText = "Get the country_code from the user and store the corresponding Country Name in country_name variable",
        description = "Get a Country name from a country code provided by the User and store in run time data",
        applicationType = ApplicationType.WEB)
public class GetCountryNameFromCountryCode extends WebAction {

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
    Map<String, String> countryCodesToNames = new HashMap<>();
        countryCodesToNames.put("AFG", "Afghanistan");
        countryCodesToNames.put("ALB", "Albania");
        countryCodesToNames.put("DZA", "Algeria");
        countryCodesToNames.put("AND", "Andorra");
        countryCodesToNames.put("AGO", "Angola");
        countryCodesToNames.put("ATG", "Antigua and Barbuda");
        countryCodesToNames.put("ARG", "Argentina");
        countryCodesToNames.put("ARM", "Armenia");
        countryCodesToNames.put("AUS", "Australia");
        countryCodesToNames.put("AUT", "Austria");
        countryCodesToNames.put("AZE", "Azerbaijan");
        countryCodesToNames.put("BHS", "Bahamas");
        countryCodesToNames.put("BHR", "Bahrain");
        countryCodesToNames.put("BGD", "Bangladesh");
        countryCodesToNames.put("BRB", "Barbados");
        countryCodesToNames.put("BLR", "Belarus");
        countryCodesToNames.put("BEL", "Belgium");
        countryCodesToNames.put("BLZ", "Belize");
        countryCodesToNames.put("BEN", "Benin");
        countryCodesToNames.put("BTN", "Bhutan");
        countryCodesToNames.put("BOL", "Bolivia");
        countryCodesToNames.put("BIH", "Bosnia and Herzegovina");
        countryCodesToNames.put("BWA", "Botswana");
        countryCodesToNames.put("BRA", "Brazil");
        countryCodesToNames.put("BRN", "Brunei");
        countryCodesToNames.put("BGR", "Bulgaria");
        countryCodesToNames.put("BFA", "Burkina Faso");
        countryCodesToNames.put("BDI", "Burundi");
        countryCodesToNames.put("CPV", "Cabo Verde");
        countryCodesToNames.put("KHM", "Cambodia");
        countryCodesToNames.put("CMR", "Cameroon");
        countryCodesToNames.put("CAN", "Canada");
        countryCodesToNames.put("CAF", "Central African Republic");
        countryCodesToNames.put("TCD", "Chad");
        countryCodesToNames.put("CHL", "Chile");
        countryCodesToNames.put("CHN", "China");
        countryCodesToNames.put("COL", "Colombia");
        countryCodesToNames.put("COM", "Comoros");
        countryCodesToNames.put("COG", "Congo (Congo-Brazzaville)");
        countryCodesToNames.put("COD", "Congo, Democratic Republic of the (Congo-Kinshasa)");
        countryCodesToNames.put("CRI", "Costa Rica");
        countryCodesToNames.put("HRV", "Croatia");
        countryCodesToNames.put("CUB", "Cuba");
        countryCodesToNames.put("CYP", "Cyprus");
        countryCodesToNames.put("CZE", "Czechia (Czech Republic)");
        countryCodesToNames.put("DNK", "Denmark");
        countryCodesToNames.put("DJI", "Djibouti");
        countryCodesToNames.put("DMA", "Dominica");
        countryCodesToNames.put("DOM", "Dominican Republic");
        countryCodesToNames.put("ECU", "Ecuador");
        countryCodesToNames.put("EGY", "Egypt");
        countryCodesToNames.put("SLV", "El Salvador");
        countryCodesToNames.put("GNQ", "Equatorial Guinea");
        countryCodesToNames.put("ERI", "Eritrea");
        countryCodesToNames.put("EST", "Estonia");
        countryCodesToNames.put("SWZ", "Eswatini");
        countryCodesToNames.put("ETH", "Ethiopia");
        countryCodesToNames.put("FJI", "Fiji");
        countryCodesToNames.put("FIN", "Finland");
        countryCodesToNames.put("FRA", "France");
        countryCodesToNames.put("GAB", "Gabon");
        countryCodesToNames.put("GMB", "Gambia");
        countryCodesToNames.put("GEO", "Georgia");
        countryCodesToNames.put("DEU", "Germany");
        countryCodesToNames.put("GHA", "Ghana");
        countryCodesToNames.put("GRC", "Greece");
        countryCodesToNames.put("GRD", "Grenada");
        countryCodesToNames.put("GTM", "Guatemala");
        countryCodesToNames.put("GIN", "Guinea");
        countryCodesToNames.put("GNB", "Guinea-Bissau");
        countryCodesToNames.put("GUY", "Guyana");
        countryCodesToNames.put("HTI", "Haiti");
        countryCodesToNames.put("VAT", "Holy See");
        countryCodesToNames.put("HND", "Honduras");
        countryCodesToNames.put("HUN", "Hungary");
        countryCodesToNames.put("ISL", "Iceland");
        countryCodesToNames.put("IND", "India");
        countryCodesToNames.put("IDN", "Indonesia");
        countryCodesToNames.put("IRN", "Iran");
        countryCodesToNames.put("IRQ", "Iraq");
        countryCodesToNames.put("IRL", "Ireland");
        countryCodesToNames.put("ISR", "Israel");
        countryCodesToNames.put("ITA", "Italy");
        countryCodesToNames.put("CIV", "Ivory Coast");
        countryCodesToNames.put("JAM", "Jamaica");
        countryCodesToNames.put("JPN", "Japan");
        countryCodesToNames.put("JOR", "Jordan");
        countryCodesToNames.put("KAZ", "Kazakhstan");
        countryCodesToNames.put("KEN", "Kenya");
        countryCodesToNames.put("KIR", "Kiribati");
        countryCodesToNames.put("KWT", "Kuwait");
        countryCodesToNames.put("KGZ", "Kyrgyzstan");
        countryCodesToNames.put("LAO", "Laos");
        countryCodesToNames.put("LVA", "Latvia");
        countryCodesToNames.put("LBN", "Lebanon");
        countryCodesToNames.put("LSO", "Lesotho");
        countryCodesToNames.put("LBR", "Liberia");
        countryCodesToNames.put("LBY", "Libya");
        countryCodesToNames.put("LIE", "Liechtenstein");
        countryCodesToNames.put("LTU", "Lithuania");
        countryCodesToNames.put("LUX", "Luxembourg");
        countryCodesToNames.put("MDG", "Madagascar");
        countryCodesToNames.put("MWI", "Malawi");
        countryCodesToNames.put("MYS", "Malaysia");
        countryCodesToNames.put("MDV", "Maldives");
        countryCodesToNames.put("MLI", "Mali");
        countryCodesToNames.put("MLT", "Malta");
        countryCodesToNames.put("MHL", "Marshall Islands");
        countryCodesToNames.put("MRT", "Mauritania");
        countryCodesToNames.put("MUS", "Mauritius");
        countryCodesToNames.put("MEX", "Mexico");
        countryCodesToNames.put("FSM", "Micronesia");
        countryCodesToNames.put("MCO", "Monaco");
        countryCodesToNames.put("MNG", "Mongolia");
        countryCodesToNames.put("MNE", "Montenegro");
        countryCodesToNames.put("MAR", "Morocco");
        countryCodesToNames.put("MOZ", "Mozambique");
        countryCodesToNames.put("MMR", "Myanmar (formerly Burma)");
        countryCodesToNames.put("NAM", "Namibia");
        countryCodesToNames.put("NRU", "Nauru");
        countryCodesToNames.put("NPL", "Nepal");
        countryCodesToNames.put("NLD", "Netherlands");
        countryCodesToNames.put("NZL", "New Zealand");
        countryCodesToNames.put("NIC", "Nicaragua");
        countryCodesToNames.put("NER", "Niger");
        countryCodesToNames.put("NGA", "Nigeria");
        countryCodesToNames.put("PRK", "North Korea");
        countryCodesToNames.put("MKD", "North Macedonia (formerly Macedonia)");
        countryCodesToNames.put("NOR", "Norway");
        countryCodesToNames.put("OMN", "Oman");
        countryCodesToNames.put("PAK", "Pakistan");
        countryCodesToNames.put("PLW", "Palau");
        countryCodesToNames.put("PSE", "Palestine State");
        countryCodesToNames.put("PAN", "Panama");
        countryCodesToNames.put("PNG", "Papua New Guinea");
        countryCodesToNames.put("PRY", "Paraguay");
        countryCodesToNames.put("PER", "Peru");
        countryCodesToNames.put("PHL", "Philippines");
        countryCodesToNames.put("POL", "Poland");
        countryCodesToNames.put("PRT", "Portugal");
        countryCodesToNames.put("QAT", "Qatar");
        countryCodesToNames.put("ROU", "Romania");
        countryCodesToNames.put("RUS", "Russia");
        countryCodesToNames.put("RWA", "Rwanda");
        countryCodesToNames.put("KNA", "Saint Kitts and Nevis");
        countryCodesToNames.put("LCA", "Saint Lucia");
        countryCodesToNames.put("VCT", "Saint Vincent and the Grenadines");
        countryCodesToNames.put("WSM", "Samoa");
        countryCodesToNames.put("SMR", "San Marino");
        countryCodesToNames.put("STP", "Sao Tome and Principe");
        countryCodesToNames.put("SAU", "Saudi Arabia");
        countryCodesToNames.put("SEN", "Senegal");
        countryCodesToNames.put("SRB", "Serbia");
        countryCodesToNames.put("SYC", "Seychelles");
        countryCodesToNames.put("SLE", "Sierra Leone");
        countryCodesToNames.put("SGP", "Singapore");
        countryCodesToNames.put("SVK", "Slovakia");
        countryCodesToNames.put("SVN", "Slovenia");
        countryCodesToNames.put("SLB", "Solomon Islands");
        countryCodesToNames.put("SOM", "Somalia");
        countryCodesToNames.put("ZAF", "South Africa");
        countryCodesToNames.put("KOR", "South Korea");
        countryCodesToNames.put("SSD", "South Sudan");
        countryCodesToNames.put("ESP", "Spain");
        countryCodesToNames.put("LKA", "Sri Lanka");
        countryCodesToNames.put("SDN", "Sudan");
        countryCodesToNames.put("SUR", "Suriname");
        countryCodesToNames.put("SWE", "Sweden");
        countryCodesToNames.put("CHE", "Switzerland");
        countryCodesToNames.put("SYR", "Syria");
        countryCodesToNames.put("TJK", "Tajikistan");
        countryCodesToNames.put("TZA", "Tanzania");
        countryCodesToNames.put("THA", "Thailand");
        countryCodesToNames.put("TLS", "Timor-Leste (East Timor)");
        countryCodesToNames.put("TGO", "Togo");
        countryCodesToNames.put("TON", "Tonga");
        countryCodesToNames.put("TTO", "Trinidad and Tobago");
        countryCodesToNames.put("TUN", "Tunisia");
        countryCodesToNames.put("TUR", "Turkey");
        countryCodesToNames.put("TKM", "Turkmenistan");
        countryCodesToNames.put("TUV", "Tuvalu");
        countryCodesToNames.put("UGA", "Uganda");
        countryCodesToNames.put("UKR", "Ukraine");
        countryCodesToNames.put("ARE", "United Arab Emirates");
        countryCodesToNames.put("GBR", "United Kingdom");
        countryCodesToNames.put("URY", "Uruguay");
        countryCodesToNames.put("UZB", "Uzbekistan");
        countryCodesToNames.put("VUT", "Vanuatu");
        countryCodesToNames.put("VEN", "Venezuela");
        countryCodesToNames.put("VNM", "Vietnam");
        countryCodesToNames.put("YEM", "Yemen");
        countryCodesToNames.put("ZMB", "Zambia");
        countryCodesToNames.put("ZWE", "Zimbabwe");






    String countryCode = tempCountryCode.getValue().toString();
    countryCode = countryCode.trim().toUpperCase();
    String countryName = countryCodesToNames.get(countryCode);



    runTimeData = new com.testsigma.sdk.RunTimeData();
    runTimeData.setValue(countryName);
    runTimeData.setKey(tempCountryName.getValue().toString());
    setSuccessMessage("Successfully stored "+ countryName +" into :: "+tempCountryName.getValue());
    return result;
  }
}