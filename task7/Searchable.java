package myfirstprogram;

public interface Searchable {

	// Define an interface called Searchable{
	    boolean search(String keyword);
	}

	// Class Document implements Searchable
	class Document implements Searchable {
	    private String text;

	    public Document(String text) {
	        this.text = text;
	    }

	    @Override
	    public boolean search(String keyword) {
	        return text.contains(keyword);
	    }
	}

	// Class WebPage implements Searchable
	class WebPage implements Searchable {
	    private String htmlContent;

	    public WebPage(String htmlContent) {
	        this.htmlContent = htmlContent;
	    }

	    @Override
	    public boolean search(String keyword) {
	        return htmlContent.contains(keyword);
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        // Create instances of Document and WebPage
	        Document document = new Document("This is a sample document.");
	        WebPage webPage = new WebPage("<html><body>This is a sample web page.</body></html>");

	        // Search for keywords
	        System.out.println("Searching for 'sample' in document: " + document.search("sample"));
	        System.out.println("Searching for 'sample' in web page: " + webPage.search("sample"));
	        System.out.println("Searching for 'java' in document: " + document.search("java"));
	        System.out.println("Searching for 'java' in web page: " + webPage.search("java"));
	    }
	}
	
}
