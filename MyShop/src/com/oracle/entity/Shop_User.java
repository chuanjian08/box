package com.oracle.entity;

public class Shop_User {
	
			private String uid;
			private String uname;
			private String upass;
			private String usex;
			private String ubirth;
			private String udesc;
			private String uemail;
			private String uphone;
			private String uadd;
			private int ustatus;
			public String getUid() {
				return uid;
			}
			public void setUid(String uid) {
				
				this.uid = uid;
			}
			public String getUname() {
				return uname;
			}
			public void setUname(String uname) {
				this.uname = uname;
			}
			public String getUpass() {
				return upass;
			}
			public void setUpass(String upass) {
				this.upass = upass;
			}
			public String getUsex() {
				return usex;
			}
			public void setUsex(String usex) {
				this.usex = usex;
			}
			public String getUbirth() {
				return ubirth;
			}
			public void setUbirth(String ubirth) {
				this.ubirth = ubirth;
			}
			public String getUdesc() {
				return udesc;
			}
			public void setUdesc(String udesc) {
				this.udesc = udesc;
			}
			public String getUemail() {
				return uemail;
			}
			public void setUemail(String uemail) {
				this.uemail = uemail;
			}
			public String getUphone() {
				return uphone;
			}
			public void setUphone(String uphone) {
				this.uphone = uphone;
			}
			public String getUadd() {
				return uadd;
			}
			public void setUadd(String uadd) {
				this.uadd = uadd;
			}
			public int getUstatus() {
				return ustatus;
			}
			public void setUstatus(int ustatus) {
				this.ustatus = ustatus;
			}
			public Shop_User(String uid, String uname, String upass, String usex, String ubirth, String udesc,
					String uemail, String uphone, String uadd, int ustatus) {
				super();
				this.uid = uid;
				this.uname = uname;
				this.upass = upass;
				this.usex = usex;
				this.ubirth = ubirth;
				this.udesc = udesc;
				this.uemail = uemail;
				this.uphone = uphone;
				this.uadd = uadd;
				this.ustatus = ustatus;
			}
			public Shop_User() {
				super();
			}
			@Override
			public String toString() {
				return "Shop_User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", usex=" + usex
						+ ", ubirth=" + ubirth + ", udesc=" + udesc + ", uemail=" + uemail + ", uphone=" + uphone
						+ ", uadd=" + uadd + ", ustatus=" + ustatus + "]";
			}
			

}
