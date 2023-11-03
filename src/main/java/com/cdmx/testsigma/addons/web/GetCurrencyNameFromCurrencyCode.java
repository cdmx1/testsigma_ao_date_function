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
@Action(actionText = "Get the currency_code from the user and store the corresponding Currency Name in currency_name variable",
        description = "Get a Currency name from a currency code provided by the User  and store in run time data",
        applicationType = ApplicationType.WEB)
public class GetCurrencyNameFromCurrencyCode extends WebAction {

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
    Map<String, String> currencyCodesToNames = new HashMap<>();
    currencyCodesToNames.put("AED", "United Arab Emirates Dirham");
    currencyCodesToNames.put("AFN", "Afghan Afghani");
    currencyCodesToNames.put("ALL", "Albanian Lek");
    currencyCodesToNames.put("AMD", "Armenian Dram");
    currencyCodesToNames.put("ANG", "Netherlands Antillean Guilder");
    currencyCodesToNames.put("AOA", "Angolan Kwanza");
    currencyCodesToNames.put("ARS", "Argentine Peso");
    currencyCodesToNames.put("AUD", "Australian Dollar");
    currencyCodesToNames.put("AWG", "Aruban Florin");
    currencyCodesToNames.put("AZN", "Azerbaijani Manat");
    currencyCodesToNames.put("BAM", "Bosnia-Herzegovina Convertible Mark");
    currencyCodesToNames.put("BBD", "Barbadian Dollar");
    currencyCodesToNames.put("BDT", "Bangladeshi Taka");
    currencyCodesToNames.put("BGN", "Bulgarian Lev");
    currencyCodesToNames.put("BHD", "Bahraini Dinar");
    currencyCodesToNames.put("BIF", "Burundian Franc");
    currencyCodesToNames.put("BMD", "Bermudian Dollar");
    currencyCodesToNames.put("BND", "Brunei Dollar");
    currencyCodesToNames.put("BOB", "Bolivian Boliviano");
    currencyCodesToNames.put("BRL", "Brazilian Real");
    currencyCodesToNames.put("BSD", "Bahamian Dollar");
    currencyCodesToNames.put("BTN", "Bhutanese Ngultrum");
    currencyCodesToNames.put("BWP", "Botswanan Pula");
    currencyCodesToNames.put("BYN", "Belarusian Ruble");
    currencyCodesToNames.put("BZD", "Belize Dollar");
    currencyCodesToNames.put("CAD", "Canadian Dollar");
    currencyCodesToNames.put("CDF", "Congolese Franc");
    currencyCodesToNames.put("CHF", "Swiss Franc");
    currencyCodesToNames.put("CLP", "Chilean Peso");
    currencyCodesToNames.put("CNY", "Chinese Yuan");
    currencyCodesToNames.put("COP", "Colombian Peso");
    currencyCodesToNames.put("CRC", "Costa Rican Colón");
    currencyCodesToNames.put("CUP", "Cuban Peso");
    currencyCodesToNames.put("CVE", "Cape Verdean Escudo");
    currencyCodesToNames.put("CZK", "Czech Republic Koruna");
    currencyCodesToNames.put("DJF", "Djiboutian Franc");
    currencyCodesToNames.put("DKK", "Danish Krone");
    currencyCodesToNames.put("DOP", "Dominican Peso");
    currencyCodesToNames.put("DZD", "Algerian Dinar");
    currencyCodesToNames.put("EGP", "Egyptian Pound");
    currencyCodesToNames.put("ERN", "Eritrean Nakfa");
    currencyCodesToNames.put("ETB", "Ethiopian Birr");
    currencyCodesToNames.put("EUR", "Euro");
    currencyCodesToNames.put("FJD", "Fijian Dollar");
    currencyCodesToNames.put("FKP", "Falkland Islands Pound");
    currencyCodesToNames.put("GEL", "Georgian Lari");
    currencyCodesToNames.put("GHS", "Ghanaian Cedi");
    currencyCodesToNames.put("GIP", "Gibraltar Pound");
    currencyCodesToNames.put("GMD", "Gambian Dalasi");
    currencyCodesToNames.put("GNF", "Guinean Franc");
    currencyCodesToNames.put("GTQ", "Guatemalan Quetzal");
    currencyCodesToNames.put("GYD", "Guyanaese Dollar");
    currencyCodesToNames.put("HKD", "Hong Kong Dollar");
    currencyCodesToNames.put("HNL", "Honduran Lempira");
    currencyCodesToNames.put("HRK", "Croatian Kuna");
    currencyCodesToNames.put("HTG", "Haitian Gourde");
    currencyCodesToNames.put("HUF", "Hungarian Forint");
    currencyCodesToNames.put("IDR", "Indonesian Rupiah");
    currencyCodesToNames.put("ILS", "Israeli New Shekel");
    currencyCodesToNames.put("INR", "Indian Rupee");
    currencyCodesToNames.put("IQD", "Iraqi Dinar");
    currencyCodesToNames.put("IRR", "Iranian Rial");
    currencyCodesToNames.put("ISK", "Icelandic Króna");
    currencyCodesToNames.put("JMD", "Jamaican Dollar");
    currencyCodesToNames.put("JOD", "Jordanian Dinar");
    currencyCodesToNames.put("JPY", "Japanese Yen");
    currencyCodesToNames.put("KES", "Kenyan Shilling");
    currencyCodesToNames.put("KGS", "Kyrgystani Som");
    currencyCodesToNames.put("KHR", "Cambodian Riel");
    currencyCodesToNames.put("KID", "Kiribati Dollar");
    currencyCodesToNames.put("KMF", "Comorian Franc");
    currencyCodesToNames.put("KRW", "South Korean Won");
    currencyCodesToNames.put("KWD", "Kuwaiti Dinar");
    currencyCodesToNames.put("KYD", "Cayman Islands Dollar");
    currencyCodesToNames.put("KZT", "Kazakhstani Tenge");
    currencyCodesToNames.put("LAK", "Laotian Kip");
    currencyCodesToNames.put("LBP", "Lebanese Pound");
    currencyCodesToNames.put("LKR", "Sri Lankan Rupee");
    currencyCodesToNames.put("LRD", "Liberian Dollar");
    currencyCodesToNames.put("LSL", "Lesotho Loti");
    currencyCodesToNames.put("LYD", "Libyan Dinar");
    currencyCodesToNames.put("MAD", "Moroccan Dirham");
    currencyCodesToNames.put("MDL", "Moldovan Leu");
    currencyCodesToNames.put("MGA", "Malagasy Ariary");
    currencyCodesToNames.put("MKD", "Macedonian Denar");
    currencyCodesToNames.put("MMK", "Myanmar Kyat");
    currencyCodesToNames.put("MNT", "Mongolian Tugrik");
    currencyCodesToNames.put("MOP", "Macanese Pataca");
    currencyCodesToNames.put("MRU", "Mauritanian Ouguiya");
    currencyCodesToNames.put("MUR", "Mauritian Rupee");
    currencyCodesToNames.put("MVR", "Maldivian Rufiyaa");
    currencyCodesToNames.put("MWK", "Malawian Kwacha");
    currencyCodesToNames.put("MXN", "Mexican Peso");
    currencyCodesToNames.put("MYR", "Malaysian Ringgit");
    currencyCodesToNames.put("MZN", "Mozambican Metical");
    currencyCodesToNames.put("NAD", "Namibian Dollar");
    currencyCodesToNames.put("NGN", "Nigerian Naira");
    currencyCodesToNames.put("NIO", "Nicaraguan Córdoba");
    currencyCodesToNames.put("NOK", "Norwegian Krone");
    currencyCodesToNames.put("NPR", "Nepalese Rupee");
    currencyCodesToNames.put("NZD", "New Zealand Dollar");
    currencyCodesToNames.put("OMR", "Omani Rial");
    currencyCodesToNames.put("PAB", "Panamanian Balboa");
    currencyCodesToNames.put("PEN", "Peruvian Nuevo Sol");
    currencyCodesToNames.put("PGK", "Papua New Guinean Kina");
    currencyCodesToNames.put("PHP", "Philippine Peso");
    currencyCodesToNames.put("PKR", "Pakistani Rupee");
    currencyCodesToNames.put("PLN", "Polish Złoty");
    currencyCodesToNames.put("PYG", "Paraguayan Guarani");
    currencyCodesToNames.put("QAR", "Qatari Rial");
    currencyCodesToNames.put("RON", "Romanian Leu");
    currencyCodesToNames.put("RSD", "Serbian Dinar");
    currencyCodesToNames.put("RUB", "Russian Ruble");
    currencyCodesToNames.put("RWF", "Rwandan Franc");
    currencyCodesToNames.put("SAR", "Saudi Riyal");
    currencyCodesToNames.put("SBD", "Solomon Islands Dollar");
    currencyCodesToNames.put("SCR", "Seychellois Rupee");
    currencyCodesToNames.put("SDG", "Sudanese Pound");
    currencyCodesToNames.put("SEK", "Swedish Krona");
    currencyCodesToNames.put("SGD", "Singapore Dollar");
    currencyCodesToNames.put("SHP", "Saint Helena Pound");
    currencyCodesToNames.put("SLL", "Sierra Leonean Leone");
    currencyCodesToNames.put("SOS", "Somali Shilling");
    currencyCodesToNames.put("SRD", "Surinamese Dollar");
    currencyCodesToNames.put("SSP", "South Sudanese Pound");
    currencyCodesToNames.put("STN", "São Tomé and Príncipe Dobra");
    currencyCodesToNames.put("SYP", "Syrian Pound");
    currencyCodesToNames.put("SZL", "Swazi Lilangeni");
    currencyCodesToNames.put("THB", "Thai Baht");
    currencyCodesToNames.put("TJS", "Tajikistani Somoni");
    currencyCodesToNames.put("TMT", "Turkmenistani Manat");
    currencyCodesToNames.put("TND", "Tunisian Dinar");
    currencyCodesToNames.put("TOP", "Tongan Pa'anga");
    currencyCodesToNames.put("TRY", "Turkish Lira");
    currencyCodesToNames.put("TTD", "Trinidad and Tobago Dollar");
    currencyCodesToNames.put("TWD", "New Taiwan Dollar");
    currencyCodesToNames.put("TZS", "Tanzanian Shilling");
    currencyCodesToNames.put("UAH", "Ukrainian Hryvnia");
    currencyCodesToNames.put("UGX", "Ugandan Shilling");
    currencyCodesToNames.put("USD", "United States Dollar");
    currencyCodesToNames.put("UYU", "Uruguayan Peso");
    currencyCodesToNames.put("UZS", "Uzbekistan Som");
    currencyCodesToNames.put("VES", "Venezuelan Bolívar");
    currencyCodesToNames.put("VND", "Vietnamese Dong");
    currencyCodesToNames.put("VUV", "Vanuatu Vatu");
    currencyCodesToNames.put("WST", "Samoan Tala");
    currencyCodesToNames.put("XAF", "Central African CFA Franc");
    currencyCodesToNames.put("XCD", "East Caribbean Dollar");
    currencyCodesToNames.put("XOF", "West African CFA Franc");
    currencyCodesToNames.put("XPF", "CFP Franc");
    currencyCodesToNames.put("YER", "Yemeni Rial");
    currencyCodesToNames.put("ZAR", "South African Rand");
    currencyCodesToNames.put("ZMW", "Zambian Kwacha");
    currencyCodesToNames.put("ZWL", "Zimbabwean Dollar");






    String currencyCode = tempCurrencyCode.getValue().toString();
    currencyCode = currencyCode.trim().toUpperCase();
    String currencyName = currencyCodesToNames.get(currencyCode);



    runTimeData = new com.testsigma.sdk.RunTimeData();
    runTimeData.setValue(currencyName);
    runTimeData.setKey(tempCurrencyName.getValue().toString());
    setSuccessMessage("Successfully stored "+ currencyName +" into :: "+tempCurrencyName.getValue());
    return result;
  }
}