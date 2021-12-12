import java.time.Duration;
import java.util.Objects;


public record VideoTape(String name, Duration duration) implements Article {

	public VideoTape {
		Objects.requireNonNull(name, "name can't be NULL");
		
		if (duration.getSeconds() <= 0)
			throw new IllegalArgumentException("duration must be over 1 seconds");
	}
	
	public String toText() {
		return "VideoTape:" + name + ":" + duration.toMinutes();
	}
}
