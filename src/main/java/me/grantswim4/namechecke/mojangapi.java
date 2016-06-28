package me.grantswim4.namechecke;


import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Grant on 5/21/2016.
 */
public class mojangapi {

	public static JsonObject readJsonFromUrl(String url) throws IOException, JsonSyntaxException {
		InputStream is = new URL(url).openStream();
		try {
			JsonObject json = new JsonObject();
			return json;
		} finally {
			is.close();
		}
	}
}
