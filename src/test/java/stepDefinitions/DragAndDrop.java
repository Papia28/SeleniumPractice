package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webApplication.testingFramework.common.ActionFunctions;
import webApplication.testingFramework.common.RobotFunctions;

public class DragAndDrop {
	
	//actionsFunctions and robotFunctions both inherit genericFunctions
	//hence one can use the genericFunctions methods by calling them 
	//via either of the objects
	
	private static final ActionFunctions af = new ActionFunctions();
	private static final RobotFunctions rf = new RobotFunctions();
	private static String [] droppedElements = null;
	
	@Then("^user selects Drag and Drop$")
	public void selectDragDrop() throws Throwable {
		try {
			Thread.sleep(100);
			//rf.isElementVisible("xpath", "OthersDropDown");
			rf.isElementVisible("xpath", "DragAndDrop");
			//rf.selectDropdownText("xpath", "OthersDropDown", "DragAndDropText");
			Thread.sleep(100);
			rf.click("xpath", "DragAndDrop");
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
			droppedElements  = rf.dragAndDropElementsRobot("xpath", "Item1", "DropHere");
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
			af.verifyDroppedItems("xpath", droppedElements, "DropedList");
			Thread.sleep(50);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in verifyDragDroppedItems().");
			throw e;
		}
	}

}
