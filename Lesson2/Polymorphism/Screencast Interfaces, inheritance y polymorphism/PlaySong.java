public interface PlaySong{
	public default void PlaySong(String songName){
		System.out.println("Playing " + songName);
	}
}