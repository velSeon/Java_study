package test07;

public class Mobile {
private String code;
private String name;
private double price;
Mobile(){}
public Mobile(String code, String name, double price) {
	super();
	this.code = code;
	this.name = name;
	this.price = price;
}
public String printInfo() {
	return code +"\t"+ name +"\t"+ price;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}



}
