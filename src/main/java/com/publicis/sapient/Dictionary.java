package com.publicis.sapient;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Dictionary {

	public static boolean isEnglishWord(String word) throws IOException {

		File file = new File(System.getProperty("user.dir") + "\\dictionary\\online_dictionary.txt");
		List<String> list = Files.readAllLines(new File(file.getAbsolutePath()).toPath(), Charset.defaultCharset());

		for (int i = 0; i < list.size();) {
			if (list.contains(word)) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
}