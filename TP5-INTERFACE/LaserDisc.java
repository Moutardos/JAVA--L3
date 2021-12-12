import java.util.Objects;

public record LaserDisc(String name) implements Article {
	
	public LaserDisc {
		Objects.requireNonNull(name, "name can't be null");
	}
	
	public String toText() {
		return "LaserDisc:" + name;
	}
	
}
