package pageObjectModel.FilterFelder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.WebElements;


public class FilterReporter extends WebElements {


    public FilterReporter() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "fa-list-alt")
    private WebElement btnEintrageAnzeigen;
    public void btnEintrageAnzeigen() {clickFunction(btnEintrageAnzeigen);    }

    @FindBy(id = "reporter_id_filter")
    private WebElement btnReporter;
    public void clickbtnReporter() {clickFunction(btnReporter);    }

    @FindBy(name = "reporter_id[]")
    private WebElement btnReporterId;

    public void typebtnReporterId(){selectElementFromDropdown(btnReporterId, "etosun");}
    //Select slc =new Select(btnReporterId);
      //  slc.selectByIndex(5);

    @FindBy(xpath = "//body/div[@id='main-container']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[2]")
    private WebElement btnfiltersearch;
    public void clickbtnfiltersearch () { clickFunction(btnfiltersearch);}

    @FindBy(xpath = "//body[@class='skin-3']/div[@id='main-container']/div[@class='main-content']/div[@class='page-content']/div[@class='row']/div[@class='col-md-12 col-xs-12']/div[@class='filter-box']/div[@id='filter']/div[@class='widget-body']/div[@class='widget-toolbox padding-4 clearfix']/div[@class='btn-toolbar']/div[@class='form-inline']/div[@class='btn-group pull-left']/a[1]")
    private WebElement btnzurucksetzen;
    public void clickbtnzurucksetzen (){ clickFunction(btnzurucksetzen);}



}
