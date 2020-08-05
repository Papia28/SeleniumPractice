package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApplication.testingFramework.common.GenericFunctions;

public class DragAndDrop {
	
	public static GenericFunctions gf = new GenericFunctions();
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
			//droppedElements = rf.dragAndDropElements("xpath", "Item1", "DropHere");			
			//droppedElements = rf.dragAndDropElements1("xpath", "ItemsToDrag", "DropHere");
			//droppedElements  = rf.dragAndDropElements("xpath", "ItemsToDrag", "DropHere");
			//droppedElements  = gf.dragAndDropElementsRobot("xpath", "Item1", "DropHere");
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
			//af.verifyDroppedItems("xpath", droppedElements, "DropedList");
			Thread.sleep(50);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in verifyDragDroppedItems().");
			throw e;
		}
	}

}
