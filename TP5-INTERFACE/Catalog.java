import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

final public class Catalog {
	private  static LinkedHashMap<String, Article> articles;

	public Catalog() {
		articles = new LinkedHashMap<String, Article>();
	}
	
	
	public void add(Article article) {
		Objects.requireNonNull(article);
		if (articles.putIfAbsent(article.name(),article) != null) {
			throw new IllegalArgumentException("Can't have multiple articles with the same name in one catalog");
		}
	}
	
	public Article lookup(String name) {
		return articles.getOrDefault(name, null);
	}
	
	public void save(Path path, Charset charset) throws IOException {
		try(var writer = Files.newBufferedWriter(path, charset)){
			for (Article article : articles.values()) {
				writer.write(article.toText());
				writer.newLine();
			}
			writer.flush();
		}
	}
	

	public void load(Path path, Charset charset) throws IOException {
		try (var reader = Files.newBufferedReader(path, charset)){
			var line = reader.readLine();
			while(line != null) {
				this.add(Article.fromText(line));
				line = reader.readLine();
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return articles.toString();
	}
	
	
	
}
