public interface Guitarist extends PlaySong{
	public default void playFavoriteSong(){
		System.out.println("Playing my favorite song");
		PlaySong("My first song");
	}
}