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
@Action(actionText = "Get the currency_name from the user and store the corresponding Currency Code in currency_code variable",
        description = "Get a Currency code from a currency name provided by the User and store in run time data",
        applicationType = ApplicationType.WEB)
public class GetCurrencyCodeFromCurrencyName extends WebAction {

  @TestData(reference = "currency_code")
  private com.testsigma.sdk.TestData tempCurrencyCode;
  @TestData(reference = "currency_name")
  private com.testsigma.sdk.TestData tempCurrencyName;
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
    Map<String, String> currencyNamesToCodes = new HashMap<>();
    
    currencyNamesToCodes.put("united arab emirates dirham", "AED");
    currencyNamesToCodes.put("afghan afghani", "AFN");
    currencyNamesToCodes.put("albanian lek", "ALL");
    currencyNamesToCodes.put("armenian dram", "AMD");
    currencyNamesToCodes.put("netherlands antillean guilder", "ANG");
    currencyNamesToCodes.put("angolan kwanza", "AOA");
    currencyNamesToCodes.put("argentine peso", "ARS");
    currencyNamesToCodes.put("australian dollar", "AUD");
    currencyNamesToCodes.put("aruban florin", "AWG");
    currencyNamesToCodes.put("azerbaijani manat", "AZN");
    currencyNamesToCodes.put("bosnia-herzegovina convertible mark", "BAM");
    currencyNamesToCodes.put("barbadian dollar", "BBD");
    currencyNamesToCodes.put("bangladeshi taka", "BDT");
    currencyNamesToCodes.put("bulgarian lev", "BGN");
    currencyNamesToCodes.put("bahraini dinar", "BHD");
    currencyNamesToCodes.put("burundian franc", "BIF");
    currencyNamesToCodes.put("bermudian dollar", "BMD");
    currencyNamesToCodes.put("brunei dollar", "BND");
    currencyNamesToCodes.put("bolivian boliviano", "BOB");
    currencyNamesToCodes.put("brazilian real", "BRL");
    currencyNamesToCodes.put("bahamian dollar", "BSD");
    currencyNamesToCodes.put("bhutanese ngultrum", "BTN");
    currencyNamesToCodes.put("botswanan pula", "BWP");
    currencyNamesToCodes.put("belarusian ruble", "BYN");
    currencyNamesToCodes.put("belize dollar", "BZD");
    currencyNamesToCodes.put("canadian dollar", "CAD");
    currencyNamesToCodes.put("congolese franc", "CDF");
    currencyNamesToCodes.put("swiss franc", "CHF");
    currencyNamesToCodes.put("chilean peso", "CLP");
    currencyNamesToCodes.put("chinese yuan", "CNY");
    currencyNamesToCodes.put("colombian peso", "COP");
    currencyNamesToCodes.put("costa rican colón", "CRC");
    currencyNamesToCodes.put("cuban peso", "CUP");
    currencyNamesToCodes.put("cape verdean escudo", "CVE");
    currencyNamesToCodes.put("czech republic koruna", "CZK");
    currencyNamesToCodes.put("djiboutian franc", "DJF");
    currencyNamesToCodes.put("danish krone", "DKK");
    currencyNamesToCodes.put("dominican peso", "DOP");
    currencyNamesToCodes.put("algerian dinar", "DZD");
    currencyNamesToCodes.put("egyptian pound", "EGP");
    currencyNamesToCodes.put("eritrean nakfa", "ERN");
    currencyNamesToCodes.put("ethiopian birr", "ETB");
    currencyNamesToCodes.put("euro", "EUR");
    currencyNamesToCodes.put("fijian dollar", "FJD");
    currencyNamesToCodes.put("falkland islands pound", "FKP");
    currencyNamesToCodes.put("georgian lari", "GEL");
    currencyNamesToCodes.put("ghanaian cedi", "GHS");
    currencyNamesToCodes.put("gibraltar pound", "GIP");
    currencyNamesToCodes.put("gambian dalasi", "GMD");
    currencyNamesToCodes.put("guinean franc", "GNF");
    currencyNamesToCodes.put("guatemalan quetzal", "GTQ");
    currencyNamesToCodes.put("guyanaese dollar", "GYD");
    currencyNamesToCodes.put("hong kong dollar", "HKD");
    currencyNamesToCodes.put("honduran lempira", "HNL");
    currencyNamesToCodes.put("croatian kuna", "HRK");
    currencyNamesToCodes.put("haitian gourde", "HTG");
    currencyNamesToCodes.put("hungarian forint", "HUF");
    currencyNamesToCodes.put("indonesian rupiah", "IDR");
    currencyNamesToCodes.put("israeli new shekel", "ILS");
    currencyNamesToCodes.put("indian rupee", "INR");
    currencyNamesToCodes.put("iraqi dinar", "IQD");
    currencyNamesToCodes.put("iranian rial", "IRR");
    currencyNamesToCodes.put("icelandic króna", "ISK");
    currencyNamesToCodes.put("jamaican dollar", "JMD");
    currencyNamesToCodes.put("jordanian dinar", "JOD");
    currencyNamesToCodes.put("japanese yen", "JPY");
    currencyNamesToCodes.put("kenyan shilling", "KES");
    currencyNamesToCodes.put("kyrgystani som", "KGS");
    currencyNamesToCodes.put("cambodian riel", "KHR");
    currencyNamesToCodes.put("kiribati dollar", "KID");
    currencyNamesToCodes.put("comorian franc", "KMF");
    currencyNamesToCodes.put("south korean won", "KRW");
    currencyNamesToCodes.put("kuwaiti dinar", "KWD");
    currencyNamesToCodes.put("cayman islands dollar", "KYD");
    currencyNamesToCodes.put("kazakhstani tenge", "KZT");
    currencyNamesToCodes.put("laotian kip", "LAK");
    currencyNamesToCodes.put("lebanese pound", "LBP");
    currencyNamesToCodes.put("sri lankan rupee", "LKR");
    currencyNamesToCodes.put("liberian dollar", "LRD");
    currencyNamesToCodes.put("lesotho loti", "LSL");
    currencyNamesToCodes.put("libyan dinar", "LYD");
    currencyNamesToCodes.put("moroccan dirham", "MAD");
    currencyNamesToCodes.put("moldovan leu", "MDL");
    currencyNamesToCodes.put("malagasy ariary", "MGA");
    currencyNamesToCodes.put("macedonian denar", "MKD");
    currencyNamesToCodes.put("myanmar kyat", "MMK");
    currencyNamesToCodes.put("mongolian tugrik", "MNT");
    currencyNamesToCodes.put("macanese pataca", "MOP");
    currencyNamesToCodes.put("mauritanian ouguiya", "MRU");
    currencyNamesToCodes.put("mauritian rupee", "MUR");
    currencyNamesToCodes.put("maldivian rufiyaa", "MVR");
    currencyNamesToCodes.put("malawian kwacha", "MWK");
    currencyNamesToCodes.put("mexican peso", "MXN");
    currencyNamesToCodes.put("malaysian ringgit", "MYR");
    currencyNamesToCodes.put("mozambican metical", "MZN");
    currencyNamesToCodes.put("namibian dollar", "NAD");
    currencyNamesToCodes.put("nigerian naira", "NGN");
    currencyNamesToCodes.put("nicaraguan córdoba", "NIO");
    currencyNamesToCodes.put("norwegian krone", "NOK");
    currencyNamesToCodes.put("nepalese rupee", "NPR");
    currencyNamesToCodes.put("new zealand dollar", "NZD");
    currencyNamesToCodes.put("omani rial", "OMR");
    currencyNamesToCodes.put("panamanian balboa", "PAB");
    currencyNamesToCodes.put("peruvian nuevo sol", "PEN");
    currencyNamesToCodes.put("papua new guinean kina", "PGK");
    currencyNamesToCodes.put("philippine peso", "PHP");
    currencyNamesToCodes.put("pakistani rupee", "PKR");
    currencyNamesToCodes.put("polish złoty", "PLN");
    currencyNamesToCodes.put("paraguayan guarani", "PYG");
    currencyNamesToCodes.put("qatari rial", "QAR");
    currencyNamesToCodes.put("romanian leu", "RON");
    currencyNamesToCodes.put("serbian dinar", "RSD");
    currencyNamesToCodes.put("russian ruble", "RUB");
    currencyNamesToCodes.put("rwandan franc", "RWF");
    currencyNamesToCodes.put("saudi riyal", "SAR");
    currencyNamesToCodes.put("solomon islands dollar", "SBD");
    currencyNamesToCodes.put("seychellois rupee", "SCR");
    currencyNamesToCodes.put("sudanese pound", "SDG");
    currencyNamesToCodes.put("swedish krona", "SEK");
    currencyNamesToCodes.put("singapore dollar", "SGD");
    currencyNamesToCodes.put("saint helena pound", "SHP");
    currencyNamesToCodes.put("sierra leonean leone", "SLL");
    currencyNamesToCodes.put("somali shilling", "SOS");
    currencyNamesToCodes.put("surinamese dollar", "SRD");
    currencyNamesToCodes.put("south sudanese pound", "SSP");
    currencyNamesToCodes.put("são tomé and príncipe dobra", "STN");
    currencyNamesToCodes.put("syrian pound", "SYP");
    currencyNamesToCodes.put("swazi lilangeni", "SZL");
    currencyNamesToCodes.put("thai baht", "THB");
    currencyNamesToCodes.put("tajikistani somoni", "TJS");
    currencyNamesToCodes.put("turkmenistani manat", "TMT");
    currencyNamesToCodes.put("tunisian dinar", "TND");
    currencyNamesToCodes.put("tongan pa'anga", "TOP");
    currencyNamesToCodes.put("turkish lira", "TRY");
    currencyNamesToCodes.put("trinidad and tobago dollar", "TTD");
    currencyNamesToCodes.put("new taiwan dollar", "TWD");
    currencyNamesToCodes.put("tanzanian shilling", "TZS");
    currencyNamesToCodes.put("ukrainian hryvnia", "UAH");
    currencyNamesToCodes.put("ugandan shilling", "UGX");
    currencyNamesToCodes.put("united states dollar", "USD");
    currencyNamesToCodes.put("uruguayan peso", "UYU");
    currencyNamesToCodes.put("uzbekistan som", "UZS");
    currencyNamesToCodes.put("venezuelan bolívar", "VES");
    currencyNamesToCodes.put("vietnamese dong", "VND");
    currencyNamesToCodes.put("vanuatu vatu", "VUV");
    currencyNamesToCodes.put("samoan tala", "WST");
    currencyNamesToCodes.put("central african cfa franc", "XAF");
    currencyNamesToCodes.put("east caribbean dollar", "XCD");
    currencyNamesToCodes.put("west african cfa franc", "XOF");
    currencyNamesToCodes.put("cfp franc", "XPF");
    currencyNamesToCodes.put("yemeni rial", "YER");
    currencyNamesToCodes.put("south african rand", "ZAR");
    currencyNamesToCodes.put("zambian kwacha", "ZMW");
    currencyNamesToCodes.put("zimbabwean dollar", "ZWL");





    String currencyName = tempCurrencyName.getValue().toString();
    currencyName = currencyName.trim().toLowerCase();
    String currencyCode = currencyNamesToCodes.get(currencyName);



    runTimeData = new com.testsigma.sdk.RunTimeData();
    runTimeData.setValue(currencyCode);
    runTimeData.setKey(tempCurrencyCode.getValue().toString());
    setSuccessMessage("Successfully stored "+ currencyCode +" into :: "+tempCurrencyCode.getValue());
    return result;
  }
}