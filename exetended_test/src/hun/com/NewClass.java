package hun.com;

public class NewClass {
	private String press="";
	private String img="";
	private String url="";
	private String category="";
	
	public NewClass() {
		
	}
	
	public NewClass(String press, String img, String url, String category) {
		this.press=press;
		this.img=img;
		this.url=url;
		this.category=category;
		
	}

	public String getPress() {
		return press;
	}

	public String getImg() {
		return img;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}
	


}
