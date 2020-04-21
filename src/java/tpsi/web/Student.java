package tpsi.web;


public class Student {
    
    private String firstName;
    private String lastName;
    private String email;
    
    public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
                this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
        
	public String getEmail(){
                return email;
        }
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        
        public void setEmail(String email){
            this.email = email;
        }
        
        
    	public String toString() {
		return firstName + " " + lastName + " " + email;
	}
    
    
    
}