package com.github.surpassm.tool.core.lang;

import com.github.surpassm.tool.core.collection.CollUtil;
import org.junit.Assert;
import org.junit.Test;

public class WeightRandomTest {

	@Test
	public void weightRandomTest() {
		WeightRandom<String> random = WeightRandom.create();
		random.add("A", 10);
		random.add("B", 50);
		random.add("C", 100);

		String result = random.next();
		Assert.assertTrue(CollUtil.newArrayList("A", "B", "C").contains(result));
	}
}
