public class BandMember extends Human implements Vocalist, Guitarist{
	public BandMember(String name){
		super(name);
	}

	public void printName(){
		System.out.println("Band Member: " + name);
	}

	public void sing(){
		System.out.println("la la la");
	}
}