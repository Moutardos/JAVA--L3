import java.time.Duration;

public sealed interface Article permits VideoTape, LaserDisc{
	
	
	public abstract String name();	
	
	
	public abstract String toText();
	
	public static  Article fromText(String articleText) {
		
		var articleTextSplited = articleText.split(":");
		return  switch(articleTextSplited[0]) {
			case "LaserDisc" -> new LaserDisc(articleTextSplited[1]);
			case "VideoTape" -> new VideoTape(articleTextSplited[1], Duration.ofMinutes(Integer.parseInt(articleTextSplited[2])));
		    default -> throw new IllegalArgumentException("Unknown type" + articleTextSplited[0]);
		};
	}
	
	
}
