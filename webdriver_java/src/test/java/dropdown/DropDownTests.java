package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOptions(){
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect nos of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
