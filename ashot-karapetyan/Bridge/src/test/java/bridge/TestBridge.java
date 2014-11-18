package bridge;

import impl.Controller;
import impl.ImageControl;
import impl.ImageController;
import impl.TableControl;
import impl.TableController;

import java.awt.ImageCapabilities;

import org.junit.Assert;
import org.junit.Test;

import api.Control;
import api.Type;

public class TestBridge {

	@Test
	public void testImage() {
		Control image = new ImageControl();
		Controller imageController = new ImageController(image);
		Assert.assertEquals(Type.SIMPLE, imageController.getControlType());
	}

	@Test
	public void testTable() {
		Control table = new TableControl();
		Controller tableController = new TableController(table);
		Assert.assertEquals(Type.TABULAR, tableController.getControlType());
	}
}
