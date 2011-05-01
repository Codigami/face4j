package com.face4j.dummy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.face4j.facebook.Client;
import com.face4j.facebook.Facebook;
import com.face4j.facebook.OAuthAccessToken;
import com.face4j.facebook.criteria.ConnectionColumnCriteria;
import com.face4j.facebook.entity.Comment;
import com.face4j.facebook.entity.Data;
import com.face4j.facebook.entity.Media;
import com.face4j.facebook.entity.Post;
import com.face4j.facebook.entity.User;
import com.face4j.facebook.entity.connection.Comments;
import com.face4j.facebook.enums.ConnectionColumn;
import com.face4j.facebook.enums.Display;
import com.face4j.facebook.enums.FqlUserColumn;
import com.face4j.facebook.enums.Paging;
import com.face4j.facebook.enums.Permission;
import com.face4j.facebook.enums.TargetType;
import com.face4j.facebook.enums.Value;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.factory.FacebookFactory;
import com.face4j.facebook.fql.FqlConnection;
import com.face4j.facebook.fql.FqlMedia;
import com.face4j.facebook.fql.FqlPost;
import com.face4j.facebook.fql.FqlUser;
import com.face4j.facebook.wrapper.FqlUserColumnCriteria;

public class Dummy {

	private static String clientId = "05c5dd19dde59bfaa8921bc0b30889c4";
	private static String clientSecret = "f152bc483259c4403aa26dd9a75b7a8d";
	//private static String code = null;
	private static String code = "135280156521587|e5b89313944fc7ae77bd401f.1-100001125197404|SFi_f4qhHy0Uqv2i9DAfMMQnFWw"; //ninjachacha
	private static String redirectUrl = "http://buffr.com/login_verify.html";

	public static void main(String[] args) throws IOException, FacebookException {
		//System.out.println(getAccessToken().getAccessToken());

		OAuthAccessToken accessToken = new OAuthAccessToken(code);
		Client client = new Client(clientId, clientSecret);
		FacebookFactory facebookFactory = new FacebookFactory(client);
		Facebook facebook = facebookFactory.getInstance(accessToken);
		
		//User[] users = facebook.getUsers(new String[]{"544232058", "100001125197404"});
		
		Post post = facebook.getPost("24712846969_126741927403627");
		
		System.out.println("post = "+post.getName()+" actor id = ");
		
		//post = facebook.getPost("");
		
		
		//facebook.postLink("http://www.youtube.com/watch?v=VYl-_uZcu64&feature=player_embedded",null, null, null,"Lovely song!", null, null, Value.EVERYONE);
		
	//	facebook.like();
		
		/*
		for(User user : users){
			System.out.println(user.getPicture());
		}*/
		
		
		//--------------------Fetching fql users
		List<FqlUserColumn> fqlColumns = new ArrayList<FqlUserColumn>();
		fqlColumns.add(FqlUserColumn.FIRST_NAME);
		fqlColumns.add(FqlUserColumn.NAME);
		fqlColumns.add(FqlUserColumn.PIC_SQUARE);
		
		FqlUserColumnCriteria fqlUserColumnCriteria = new FqlUserColumnCriteria();
		fqlUserColumnCriteria.setUids(new String[]{"544232058", "100001125197404"});
		
		FqlUser[] fqlUsers = facebook.fqlUsers(fqlColumns, fqlUserColumnCriteria);
		for(FqlUser user : fqlUsers){
			System.out.println("first name = "+user.getFirstName()+" name = "+user.getName()+" pic = "+user.getPicSquare());
		}
		//--------------------Fetching fql users
		
		List<ConnectionColumn> columnNames = new ArrayList<ConnectionColumn>();
		columnNames.add(ConnectionColumn.IS_DELETED);
		columnNames.add(ConnectionColumn.IS_FOLLOWING);
		columnNames.add(ConnectionColumn.SOURCE_ID);
		columnNames.add(ConnectionColumn.TARGET_ID);
		columnNames.add(ConnectionColumn.TARGET_TYPE);
		columnNames.add(ConnectionColumn.UPDATED_TIME);
		
		ConnectionColumnCriteria columnCriteria = new ConnectionColumnCriteria();
		columnCriteria.setTargetType(TargetType.PAGE);
		
		FqlConnection[] connections = facebook.getConnection(columnNames, columnCriteria);
		
		/*for(FqlConnection connection : connections){
			System.out.println(connection.getTargetId());
			//User user = facebook.getUser(connection.getTargetId());
		}*/
		
		
		FqlPost[] fqlPost = facebook.newsFeed();
		
		for(FqlPost fqlPost2 : fqlPost){
		
		System.out.println("Post id: "+fqlPost2.getPostId()+" source id: "+fqlPost2.getSourceId()+" actor id: "+fqlPost2.getActorId()+" viewer id: "+fqlPost2.getViewerId());	
		//Post post = facebook.getPost(fqlPost2.getPostId());
	
		List<FqlMedia> medias =  fqlPost2.getAttachment().getMedia();
		
		if(medias != null){
			for(FqlMedia fqlMedia : medias){
				if(fqlMedia.getType().equals("video")){
					System.out.println("Media is "+fqlMedia.getHref()+" "+fqlMedia.getSrc()+" "+fqlMedia.getVideo().getDisplayUrl()+" "+fqlMedia.getVideo().getSourceUrl());
				}
			}
		}
		}
		
		
		/*if(post!=null){
			System.out.println(post.getId());
			System.out.println(post.getName());
			System.out.println(post.getPicture());
			System.out.println(post.getCreatedTime());

				// -----------Likes Test-----------
				// Likes likes = post.getConnectionLikes(facebook);
				//
				// if (likes != null) {
				// System.out.println("Hurray! Likes is not null.");
				// for (Data data : likes.getData()) {
				// System.out.println("ID: " + data.getId() + " Name: " + data.getName());
				// }
				//
				// System.out.println("Done with the first set, getting next");
				//
				// likes = likes.getNext(facebook);
				//
				// if (likes != null) {
				// System.out.println("Hurray! Likes next pagination works!");
				// for (Data data : likes.getData()) {
				// System.out.println("ID: " + data.getId() + " Name: " + data.getName());
				// }
				// }
				//
				// likes = likes.getPrevious(facebook);
				//
				// if (likes != null) {
				// System.out.println("Hurray! Likes prev pagination works!");
				// for (Data data : likes.getData()) {
				// System.out.println("ID: " + data.getId() + " Name: " + data.getName());
				// }
				// }
				// }
				// -----------Likes Test-----------

				// -----------Comments Test-----------

				Map<Paging, String> pagingCriteria = new HashMap<Paging, String>();
				pagingCriteria.put(Paging.LIMIT, "3");
				Comments comments = post.getConnectionsComments(facebook, pagingCriteria);

				if (comments != null) {
					System.out.println("Hurray! Comments is not null.");
					
					String[] concatFbIds = new String[comments.getComments().size()];
					int i=0;
					for (Comment data : comments.getComments()) {
						System.out.println("ID: " + data.getId() + " Name: " + data.getFrom().getName()
								+ " Comment: "+data.getMessage());
						
						concatFbIds[i] = ""+data.getFrom().getId();
						i++;
					}

					User[] users = facebook.getUsers(concatFbIds);
					
					System.out.println(users[0].getFirstName());
					
					System.out.println("Done with the first set, getting next");

					comments = comments.getNext(facebook);

					if (comments != null) {
						System.out.println("Hurray! Comments next pagination works!");
						for (Comment data : comments.getComments()) {
							System.out.println("ID: " + data.getId() + " Name: " + data.getFrom().getName());
						}

					comments = comments.getPrevious(facebook);

					if (comments != null) {
						System.out.println("Hurray! Comments prev pagination works!");
						for (Comment data : comments.getComments()) {
							System.out.println("ID: " + data.getId() + " Name: " + data.getFrom().getName());
						}
					}
				}
					
				}
				// -----------Comments Test-----------

			//break;
		}*/
		//}
		
		// User fbUser = facebook.getCurrentUser();
		// System.out.println(fbUser.getFirstName());

		/*FqlPost[] posts = facebook.newsFeed();

		if (posts != null) {
			for (FqlPost post : posts) {

				System.out.println("Message: " + post.getMessage());
				if (post.getAttachment() != null) {
					System.out.println("" + post.getAttachment().getHref());
				}
			}
		}*/
		
		//facebook.postLink("http://justunfollow.com");
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
