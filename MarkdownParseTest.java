import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

/*     @Test
    public void addition(){
        assertEquals(2,1+1);
    }

    @Test
    public void testMarkdown() throws IOException{
        Path fileName = Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }
    @Test
    public void testMarkdown1() throws IOException{
        Path fileName = Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), parser);
    }
    @Test
    public void testMarkdown2() throws IOException{
        Path fileName = Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", ""), parser);
    }
    @Test
    public void testMarkdown3() throws IOException{
        Path fileName = Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> parser = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html", "blank.com"), parser);
    } */

    @Test
    public void testsnippet1() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/snippet1.md"));
        List<String> expect = List.of("url.com","`google.com","google.com","ucsd.edu");
        assertEquals(expect,MarkdownParse.getLinks(contents));
    }

    @Test
    public void testsnippet2() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/snippet2.md"));
        List<String> expect = List.of("a.com","b.com","a.com(())","example.com");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void testsnippet3() throws IOException {
        String contents = Files.readString(Path.of("C:/Users/taixin/Documents/GitHub/markdown-parser/snippet3.md"));
        List<String> expect = List.of(" https://www.twitter.com","https://ucsd-cse15l-w22.github.io","github.com","https://cse.ucsd.edu/");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

}
