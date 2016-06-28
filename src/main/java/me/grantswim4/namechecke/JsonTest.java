package me.grantswim4.test;

import java.io.IOException;

import com.google.gson.JsonSyntaxException;

public class test {

	public static void main(String[] args) {

		// Setup the string holding the UUID without Hyphens.
		String uuidWOH;
		String ply;
		String UUID;
		{

			ply = "GRANTSWIM4";
			UUID = "517cee61-6263-4840-9239-6ea8c3b06c2f";

			// Remove the hyphens.
			uuidWOH = UUID.replaceAll("-", "");

			// Make sure player isn't empty.
			if (ply != null) {
				// Send the name and URL back to the sender of auto doesn't
				// work.
				System.out.println("Target: " + ply + "(" + UUID + ")");
				System.out.println("Website: ");
				System.out.println("https://api.mojang.com/user/profiles/" + uuidWOH + "/names");
				// Try to do it atomically
				System.out.println("Attempting InGame Results...");
				try {
					// String up the output (To see more look at MojangAPI
					// class)
					String tar = mojangapi.readJsonFromUrl("https://api.mojang.com/user/profiles/" + uuidWOH + "/names")
							.toString();

					System.out.println(tar);
				}
				// Catch for some errors.
				catch (JsonSyntaxException e) {
					System.out.println("Failed to grab ingame results!");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("Failed to grab ingame results!");
					e.printStackTrace();
				}

			}

		}
		{
		}

	}
}
