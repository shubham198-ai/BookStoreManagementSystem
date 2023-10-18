package com.project.bookstore.security;

public class JwtResponse {
	 private String jwtToken;
	  private String username;
	  
	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	  public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private String jwtToken;
	        private String username;

	        public Builder jwtToken(String jwtToken) {
	            this.jwtToken = jwtToken;
	            return this;
	        }

	        public Builder username(String username) {
	            this.username = username;
	            return this;
	        }

	        public JwtResponse build() {
	            JwtResponse response = new JwtResponse();
	            response.jwtToken = this.jwtToken;
	            response.username = this.username;
	            return response;
	        }

	public void JwtResponse(String jwtToken, String username) {
		//super();
		this.jwtToken = jwtToken;
		this.username = username;
	}

	@Override
	public String toString() {
		return "JwtResponse [jwtToken=" + jwtToken + ", username=" + username + "]";
	}

	    }
}


