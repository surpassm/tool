package com.github.surpassm.tool.core.swing;

import com.github.surpassm.tool.core.io.FileUtil;
import org.junit.Ignore;
import org.junit.Test;

public class RobotUtilTest {

	@Test
	@Ignore
	public void captureScreenTest() {
		RobotUtil.captureScreen(FileUtil.file("e:/screen.jpg"));
	}
}
