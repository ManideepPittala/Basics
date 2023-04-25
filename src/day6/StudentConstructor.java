package day6;


public class StudentConstructor {
	 private int id;
	    private String name;
	    private int age;
	    private String address;
	    
	    public StudentConstructor(int id, String name, int age, String address) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }
	    

	public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor student = new StudentConstructor(123, "John Doe", 20, "123 Main St");
		student.setName("Jane Smith");
		student.setAge(21);
		System.out.println(student.getName() + " is " + student.getAge() + " years old and lives at " + student.getAddress());


	}

}
