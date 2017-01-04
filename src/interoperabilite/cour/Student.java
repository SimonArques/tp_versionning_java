package interoperabilite.cour;

import interoperabilite.cour.User;


public class Student extends User {
	public Student(Gender _gender, String first, String last, boolean _isVerified,
			byte[] _userImage) {
		super(_gender,first,last,_isVerified,_userImage);
		
	}
}
