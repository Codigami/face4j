package com.face4j.dummy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.face4j.facebook.Client;
import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.enums.Display;
import com.face4j.facebook.enums.Permission;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.factory.FacebookFactory;

public class Dummy {

	private static String clientId = "CLIENT_ID_HERE";
	private static String clientSecret = "CLIENT_SECRET_HERE";
	private static String code = "OAUTH_ACCESS_CODE_HERE";
	private static String redirectUrl = "REDIRECT_URL_HERE";

	public static void main(String[] args) throws IOException, FacebookException {
		
		
		
		
		
	}

	private static OAuthAccessToken getAccessToken() throws IOException, FacebookException {
		Client client = new Client(clientId, clientSecret);
		FacebookFactory facebookFactory = new FacebookFactory(client);
		OAuthAccessToken accessToken = null;

		String tempRedirectUrl = facebookFactory.getRedirectURL(redirectUrl, Display.POPUP, Permission.EMAIL,
				Permission.OFFLINE_ACCESS, Permission.READ_STREAM, Permission.PUBLISH_STREAM);

		if (code == null) {
			System.out.println("Go to this URL and then paste the code that you get!");
			System.out.println(tempRedirectUrl);

			InputStreamReader converter = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(converter);

			code = in.readLine();
			System.out.println(code);
			accessToken = facebookFactory.getOAuthAccessToken(code, redirectUrl);
		} else {
			accessToken = new OAuthAccessToken(code);
		}

		return accessToken;
	}
}
