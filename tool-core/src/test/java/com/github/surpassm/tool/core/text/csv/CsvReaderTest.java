package com.github.surpassm.tool.core.text.csv;

import com.github.surpassm.tool.core.io.resource.ResourceUtil;
import com.github.surpassm.tool.core.util.CharsetUtil;
import org.junit.Assert;
import org.junit.Test;

public class CsvReaderTest {
	
	@Test
	public void readTest() {
		CsvReader reader = new CsvReader();
		CsvData data = reader.read(ResourceUtil.getReader("test.csv", CharsetUtil.CHARSET_UTF_8));
		Assert.assertEquals("关注\"对象\"", data.getRow(0).get(2));
	}
}
