package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApplication.testingFramework.base.GenericFunctions;
import webApplication.testingFramework.common.ActionFunctions;

public class DragAndDropRobot {
	
	private static GenericFunctions gf = new GenericFunctions();
	private static WebDriver driver = gf.getDriver();
	private static String [] droppedElements = null;
	
	@Then("^user selects Drag and Drop$")
	public void selectDragDrop() throws Throwable {
		try {
			Thread.sleep(100);
			gf.isElementVisible("xpath", "DragAndDrop");
			//rf.selectDropdownText("xpath", "OthersDropDown", "DragAndDropText");
			Thread.sleep(100);
			gf.click("xpath", "DragAndDrop");
			Thread.sleep(50);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in selectDragDrop().");
			throw e;
		}
	}
	
	@When("^user drags and drops all items$")
	public void performDragAndDrop() throws Throwable {
		try {
			Thread.sleep(100);
			//droppedElements = ActionFunctions.dragAndDropElements(gf, "xpath", "ItemsToDrag", "DropHere");			
			//droppedElements = ActionFunctions.dragAndDropElements1(gf, "xpath", "ItemsToDrag", "DropHere");
			//droppedElements  = RobotFunctions.dragAndDropElementsRobot("xpath", "Item1", "DropHere");
			ActionFunctions.dragAndDropElement(driver, GenericFunctions.getElement("xpath", "Item1"), GenericFunctions.getElement("xpath", "DropHere"));	
			Thread.sleep(50);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in performDragAndDrop().");
			throw e;
		}
	}
	
	@Then("^all items displayed in list$")
	public void verifyDragDroppedItems() throws Throwable {
		try {
			Thread.sleep(100);
			ActionFunctions.verifyDroppedItems(driver, GenericFunctions.getElements("xpath", "DropedList"), droppedElements);
			Thread.sleep(50);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in verifyDragDroppedItems().");
			throw e;
		}
	}

}