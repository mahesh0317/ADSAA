class MedicalShop{

	
	private String diseaseName;
	private int id;
	private double power;
	private String content;
	private double price;
	
	public Employee(String diseaseName, int id, double power, String content,double price){
		this.diseaseName = diseaseName;
		this.id = id;
		this.power = power;
		this.content = content;
		this.price=price;
	}
	
	// read -> get with return type
	//write -> set
	
	public String getdiseaseName(){
		return this.diseaseName;
	}
	
	public void setName(String diseaseName){
		this.diseaseName = diseaseName;
	}
	
	
	public int getId(){
		return this.Id;
	}
	
	public void setAge(int id){
		this.id=id;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
}

class EncapsulationDmo{

	public static void main(String[] args){
		Employee e1 = new Employee("Mahesh",22,22000.0,"Male");
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		// to modify data , call set methods
		e1.setName("Mali Mahesh");
		e1.setAge(23);
		e1.setSalary(52000.0);
		e1.setGender("Female");
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getGender());
		
		
		
	}
}