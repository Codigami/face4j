package com.face4j.dummy;

import java.io.*;

import com.face4j.facebook.*;
import com.face4j.facebook.enums.Display;
import com.face4j.facebook.enums.Permission;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.factory.FacebookFactory;
import com.face4j.facebook.fql.FqlMedia;
import com.face4j.facebook.fql.FqlPost;

public class Dummy {

	private static String clientId = "05c5dd19dde59bfaa8921bc0b30889c4";
	private static String clientSecret = "f152bc483259c4403aa26dd9a75b7a8d";
	// private static String code = null;
	private static String code = "135280156521587|5f40d6c750cab16c0a3804e9-544232058|kLbZru_LDDlsxL38aw9eBqSapHw";
	private static String redirectUrl = "http://buffr.com/login_verify.html";

	public static void main(String[] args) throws IOException, FacebookException {
		// System.out.println(getAccessToken().getAccessToken());

		OAuthAccessToken accessToken = new OAuthAccessToken(code);
		Client client = new Client(clientId, clientSecret);
		FacebookFactory facebookFactory = new FacebookFactory(client);
		Facebook facebook = facebookFactory.getInstance(accessToken);
		// User fbUser = facebook.getCurrentUser();
		// System.out.println(fbUser.getFirstName());

		FqlPost[] posts = facebook.newsFeed();

		if (posts != null) {
			for (FqlPost post : posts) {

				System.out.println("Message: " + post.getMessage() + " Post Id: " + post.getPostId() + " Actor Id: "
						+ post.getActorId());
				if (post.getAttachment() != null) {
					System.out.println("Type: " + post.getAttachment().getFbObjectType() + " url: "
							+ post.getAttachment().getHref());

					if (post.getAttachment().getMedia() != null) {
						for (FqlMedia media : post.getAttachment().getMedia()) {
							if (media.getPhoto() != null) {
								System.out.println("Photo: aid: " + media.getPhoto().getAid() + " pid: " + media.getPhoto().getPid());
							} else if (media.getVideo() != null) {
								System.out.println("Video: " + media.getVideo().getDisplayUrl());
							}
						}
					}

				}

				System.out.println("-----------------------------");
			}
		}

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
