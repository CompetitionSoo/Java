package sec03.exam02;
// Scanner 로 입력된 문자열 얻기
public class Product {
	private int pno;
	private String name;
	private int price;
	private int stock;  //재고
	
	public int getPno() {return pno; }
	public void setPno(int pno) { this.pno = pno; }
	
		
	public String getName() {return name; }
	public void setName(String name) { this.name = name; }
	
	public int getPrice() {return price; }
	public void setPrice(int price) { this.price = price; }
	
	public int getStock() {return stock; }
	public void setStock(int stock) { this.stock = stock; }
}