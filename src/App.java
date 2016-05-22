class Frog {
	public String name;
	public int id;
	
	public Frog(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		//One way to do toString:
//		return String.format("Id: %2d, Name: %s \n", id, name);
		
		//Another way to do toString:
//		/*
		 StringBuilder sb = new StringBuilder();
		 sb.append("Id: ")
		 .append(id)
		 .append(", Name: ")
		 .append(name);
		 
		 return sb.toString();
//		 */
	}
	
}
public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog("Freddy", 1);
		System.out.println(frog1);
	}

}
