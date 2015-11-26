import static org.junit.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import au.com.bytecode.opencsv.CSVReader;

@RunWith(value = Parameterized.class)
public class CSVTest {

private String stringValue;

public CSVTest(String stringValue) 
{
this.stringValue = stringValue;
} 

@Parameters
public static Collection data() throws IOException {

/*
* if the values of the parameters are not read from a file,
* the data array is created this way.
Object[][] data = 
{
{"java-author-10"}, 
{"oracle-date-20"}, 
{"microsoft-title-15"}
};

* if the values of the parameters are read from a file, 
* the data array needs to be populated from the file
*/

String filePath = "sample.csv";

CSVReader csvSource;
List allLines; 

csvSource = new CSVReader(new FileReader(filePath));
allLines = csvSource.readAll();
csvSource.close();

Object[][] data = new Object[allLines.size()][];

for (int lineNumber = 0; lineNumber < allLines.size(); lineNumber++) 
data[lineNumber] = (Object[]) allLines.get(lineNumber); 

return Arrays.asList(data); 
}

@Test
public void testPage() throws InterruptedException
{ 
String[] values = stringValue.split("-"); 
String keyword = values[0]; 

WebDriver driver;

driver = new FirefoxDriver();

driver.get("http://www.vpl.ca");

WebElement searchField;
searchField = driver.findElement(By.xpath("//input[@id='globalQuery']"));

searchField.click();

searchField.sendKeys(keyword );

WebElement searchButton;
searchButton = driver.findElement(By.xpath("//input[@class='search_button']"));

searchButton.click();

Thread.sleep(5000);

String resultsPageUrl = "t=keyword";

assertTrue("this is not the results page", driver.getCurrentUrl().indexOf(resultsPageUrl) >= 0); 

driver.quit(); 

} 
}