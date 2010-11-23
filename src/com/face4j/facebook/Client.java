package com.face4j.facebook;

public class Client {
	
	private String clientId;
	private String clientSecret;
	
 /**
  * @param clientId The client ID of your application as provided by the provider (ex. Facebook, twitter). You would need to register your 
  * application with the provider to obtain a client id.
  * @param clientSecret The client secret of your application
  */
 public Client(String clientId, String clientSecret){
	 this.clientId = clientId;
	 this.clientSecret = clientSecret;
 }

 public String getClientId() {
	 return clientId;
 }

 public String getClientSecret() {
	 return clientSecret;
 }
	

}
