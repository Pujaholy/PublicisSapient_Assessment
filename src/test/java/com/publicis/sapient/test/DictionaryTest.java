package com.publicis.sapient.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.publicis.sapient.Dictionary;

public class DictionaryTest {

	@Test
	public void isEnglishWord_Positive() throws IOException {
		boolean flag = Dictionary.isEnglishWord("working");
		Assert.assertEquals(flag, true);
	}

	@Test
	public void isEnglishWord_Negative1() throws IOException {
		boolean flag = Dictionary.isEnglishWord("@467@");
		Assert.assertEquals(flag, false);
	}

	@Test
	public void isEnglishWord_Negative2() throws IOException {
		boolean flag = Dictionary.isEnglishWord("agjnjgrkgk");
		Assert.assertEquals(flag, false);
	}

	@Test
	public void isEnglishWord_Negative3() throws IOException {
		boolean flag = Dictionary.isEnglishWord("1234");
		Assert.assertEquals(flag, false);
	}

}
