package apiEngine;

import java.util.HashMap;
import java.util.Map;

public class DataResponse {
	
	public String access_token;
	public String scope;
	public String token_type;
	public String expires_in;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	* No args constructor for use in serialization
	*
	*/
public DataResponse()
{
	
}
	/**
	*
	* @param access_token
	* @param scope
	* @param token_type
	* @param expires_in
	*/
	public DataResponse(String access_token, String scope, String token_type, String expires_in) {
	super();
	this.access_token = access_token;
	this.scope = scope;
	this.token_type = token_type;
	this.expires_in = expires_in;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
