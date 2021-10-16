package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {
    @Test
    void testingFileMaker(){
        makeSite ms = new makeSite();
        String webName = "awesomeco";
        String path = "./website/";

        String actual = ms.createSite(webName, path);
        String expected = "Created ./website/awesomeco";

        assertEquals(expected, actual);
    }

    @Test
    void testingJavaMaker(){
        makeJava mj = new makeJava();
        String webName = "awesomeco";
        String path = "./website/";

        String actual = mj.createJavaScriptFile(true, webName, path);
        String expected = "Created ./website/awesomeco/js/";

        assertEquals(expected, actual);
    }

    @Test
    void testingCSSMaker(){
        makeCSS mcss = new makeCSS();
        String webName = "awesomeco";
        String path = "./website/";

        String actual = mcss.createCSSFile(true, webName, path);
        String expected = "Created ./website/awesomeco/css/";

        assertEquals(expected, actual);
    }

    @Test
    void testingHTMLMaker() throws IOException {
        makeHTML mhtml = new makeHTML();
        String webName = "awesomeco";
        String path = "./website/";
        String author = "Max Power";

        String actual = mhtml.createHTML(webName, path, author);
        String expected = "Created ./website/awesomeco/index.html";

        assertEquals(expected, actual);
    }
}