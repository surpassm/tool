package com.github.surpassm.tool.core.io.file;

import com.github.surpassm.tool.core.io.FileUtil;
import com.github.surpassm.tool.core.util.CharsetUtil;
import org.junit.Ignore;
import org.junit.Test;

public class TailerTest {
	
	@Test
	@Ignore
	public void tailTest() {
		FileUtil.tail(FileUtil.file("e:/tail.txt"), CharsetUtil.CHARSET_GBK);
	}
	
	@Test
	@Ignore
	public void tailWithLinesTest() {
		Tailer tailer = new Tailer(FileUtil.file("f:/test/test.log"), Tailer.CONSOLE_HANDLER, 2);
		tailer.start();
	}
}
