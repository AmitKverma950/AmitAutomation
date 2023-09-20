package com.assig;

import java.util.ResourceBundle;

public class App {

	public int SignUp(String infn, String inln, String inemail, String inpass) {
		ResourceBundle r=ResourceBundle.getBundle("config");
		String fn = r.getString("FN");
		String ln = r.getString("LN");
		String em = r.getString("Email");
		String ps = r.getString("Password");
if(infn.equals(fn)&& inln.equals(ln) && inemail.equals(em) && inpass.equals(ps)) {
	return 1;
}
else {
	return 0;

}

	}
}
