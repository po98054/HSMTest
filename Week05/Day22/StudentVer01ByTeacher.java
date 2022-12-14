package Day22;

import lombok.Data;

@Data
public class StudentVer01ByTeacher {
	
	private String name;
	
	private String birthday;

	public StudentVer01ByTeacher(String name, String birthday) {
		
		this.name = name;
		
		this.birthday = birthday;
		
	}

	public StudentVer01ByTeacher(StudentVer01ByTeacher std) {
		
		this.name = std.name;
		
		this.birthday = std.birthday;
		
	}
	
}