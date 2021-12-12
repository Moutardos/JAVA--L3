import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

public class Main {

	public static void main(String[] args) throws IOException {
	     var laserDisc = new LaserDisc("Jaws");
	     var videoTape = new VideoTape("The Cotton Club", Duration.ofMinutes(128));
	     var videoTape2 = new VideoTape("Mission Impossible", Duration.ofMinutes(110));

	    var catalog = new Catalog();
	    catalog.add(laserDisc);
	    catalog.add(videoTape);
	    catalog.add(videoTape2);
//	    catalog.add(new LaserDisc("Mission Impossible")); // exception
	    System.out.println(catalog.lookup("Jaws"));
	    System.out.println(catalog.lookup("The Cotton Club"));
	    System.out.println(catalog.lookup("Indiana Jones"));

	    var laserDiscText = laserDisc.toText();
	    var videoTapeText = videoTape.toText();
	    System.out.println(laserDiscText);  // LaserDisc:Jaws
	    System.out.println(videoTapeText);  // VideoTape:The Cotton Club:128
	    
	    var laserDisc2 = Article.fromText(laserDiscText);
	    var videoTape3 = Article.fromText(videoTapeText);
	    System.out.println(laserDisc.equals(laserDisc2));  // true
	    System.out.println(videoTape.equals(videoTape3));  // true
	    
	    var catalog2 = new Catalog();
	    catalog2.add(laserDisc);
	    catalog2.add(videoTape);
	    catalog2.save(Path.of("catalog.txt"));
	    
	    
	    var catalog3 = new Catalog();
	    catalog3.load(Path.of("catalog.txt"));
	    System.out.println(catalog3.lookup("Jaws"));  // LaserDisc:Jaws
	    System.out.println(catalog3.lookup("The Cotton Club"));  // VideoTape:The Cotton Club:128

	}

}
