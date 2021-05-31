package JavaPrograms;

public class Constructorchain {
	
	int id;
	String name,city;
	
	Constructorchain(int id,String name){ //2 parameterized constructor
		
		this.id=id;
		this.name=name;
				
	}
Constructorchain(int id,String name, String city){ //2 parameterized constructor
		
		this(id,name);//constructor chaining
		this.city=city;
				
	}
	void display() {
		System.out.println(id+ " "+name+"   "+city);
	}
	
	

	public static void main(String[] args) {
	
		Constructorchain s= new Constructorchain(10,"kavitha");
		System.out.println(s.id);
		System.out.println(s.name);
		//
		s.display();
		
		System.out.println("===================");
		
		Constructorchain s1= new Constructorchain(10,"kavitha","bangalore");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.city);
	
	}

}
