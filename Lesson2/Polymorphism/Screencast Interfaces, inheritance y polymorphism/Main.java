public class Main{
	public static void main(String[] args) {
		Human john = new Human("john");
		Human louis = new BandMember("louis");
		BandMember jack = new BandMember("jack");

		john.printName();
		louis.printName();
		jack.printName();

		jack.sing();
		jack.playFavoriteSong();
	}
}