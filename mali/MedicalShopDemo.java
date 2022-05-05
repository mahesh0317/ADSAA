class MedicalShop{

	
	private String diseaseName;
	private int id;
	private double power;
	private String content;
	private double price;
	
	public MedicalShop(String diseaseName, int id, double power, String content,double price){
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
	
	public void setdiseaseName(String diseaseName){
		this.diseaseName = diseaseName;
	}
	
	
	public int getid(){
		return this.id;
	}
	
	public void setid(int id){
		this.id=id;
	}
	
	public double getpower(){
		return this.power;
	}
	
	public void setpower(double power){
		this.power = power;
	}
	
	public String getcontent(){
		return this.content;
	}
	
	public void setcontent(String content){
		this.content = content;
	}
	public double getprice(){
		return this.price;
	}
	
	public void setprice(double price){
		this.price = price;
	}
}
public class MedicalShopDemo{

	public static void main(String[] args){
		MedicalShop e1 = new MedicalShop("Fever",01,75.50,"Paracetmol",150.50);
		System.out.println(e1.getdiseaseName());
		System.out.println(e1.getid());
		System.out.println(e1.getpower());
		System.out.println(e1.getcontent());
		System.out.println(e1.getprice());
		System.out.println("==========================================================================================");
		
		// to modify data , call set methods
		e1.setdiseaseName("Diabetes");
		e1.setid(2);
		e1.setpower(500.50);
		e1.setcontent("Glimepiride");
		e1.setprice(123.25);
		
		System.out.println(e1.getdiseaseName());
		System.out.println(e1.getid());
		System.out.println(e1.getpower());
		System.out.println(e1.getcontent());
		System.out.println(e1.getprice());
		System.out.println("==========================================================================================");
		
		MedicalShop e2 = new MedicalShop("Acidity",3,800.20,"Pantaprozon",48.23);
		System.out.println(e2.getdiseaseName());
		System.out.println(e2.getid());
		System.out.println(e2.getpower());
		System.out.println(e2.getcontent());
		System.out.println(e2.getprice());
		System.out.println("==========================================================================================");
		
		e2.setdiseaseName("Hypertension");
		e2.setid(04);
		e2.setpower(100.20);
		e2.setcontent("Tenmisartal");
		e2.setprice(1000.25);
		
		System.out.println(e2.getdiseaseName());
		System.out.println(e2.getid());
		System.out.println(e2.getpower());
		System.out.println(e2.getcontent());
		System.out.println(e2.getprice());
		System.out.println("==========================================================================================");
		
	}
}

