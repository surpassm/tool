package com.github.surpassm.tool.core.io;

import com.github.surpassm.tool.core.io.file.FileReader;
import org.junit.Assert;
import org.junit.Test;

/**
 * 文件读取测试
 * @author Looly
 *
 */
public class FileReaderTest {
	
	@Test
	public void fileReaderTest(){
		FileReader fileReader = new FileReader("test.properties");
		String result = fileReader.readString();
		Assert.assertNotNull(result);
	}
}
