package edu.swjtuhc.demo.model;

public class ChangeModel {
	   public	String password;
	    public  String username;
	    public  String newpassword;
		public 	String session;
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getNewpassword() {
			return newpassword;
		}
		public void setNewpassword(String newpassword) {
			this.newpassword = newpassword;
		}
		public String getSession() {
			return session;
		}
		public void setSession(String session) {
			this.session = session;
		}
		@Override
		public String toString() {
			return "ChangeModel [password=" + password + ", username=" + username + ", newpassword=" + newpassword
					+ ", session=" + session + "]";
		}
}
