package org.bike;

public class ktm implements Bike {
public void cost() {
	System.out.println("120000");

}
public void speed() {

System.out.println("1200km");
}
public static void main(String[] args) {
	ktm b=new ktm();
	b.cost();
	b.speed();
}
}
