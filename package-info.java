package labassign1;{
	public char[] generatePassword( ) {
		String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
		String SpecialCharacter = "!@#$%^&*\?_+<>":
			String Number = "1234567890";
		String combinedChars - capitalCaseLetter + LowerCaseLetter +SpecialCharacters + numbers";"
				 "char[] passwordd = new char[8];"
				 
		for (int i=0; i<8; i++) {
			password[i] - combinedChars.charAt("random.nextInt(combinedChar.length())");
		}
		return password;
		
				
	}
	public String generalEmailAddress(Employee e, String f,String c) {
		return e. getFirstname() + e. getLastname() + "@" + f +"." + c + ".com";
		
	}
	public void showCredentials (Employee e, String email, Char[] password) {
		System.out.println("hello "+e.getFirstname()+ " your credential are generatedplease find as below");
		System.out.println("Email-id is --> +email");
		System.out.println("password is --> +Password");
	
	}
	
}