public class Ankara {
//Ankara class adi MovieTicket
private String movieName;
private int ageLimit;
private double price;
 Ankara(String movieName, int ageLimit, double price){
  this.getMovieName();
  this.getAgeLimit();
  this.getPrice();
 }
 public String getMovieName(){
  return movieName;
 }
 public int getAgeLimit(){
  return ageLimit;
 }
 public double getPrice(){
  return price;
 }
 public void setMovieName(String movieName){
  this.movieName=movieName;
 }
 public void setAgeLimit(int ageLimit){
  this.ageLimit=ageLimit;
  if (ageLimit<0) {
    System.out.println("Age limit cannot be below 0!");
  }
 }
 public void setPrice(double price){
  this.price=price;
  if (price<0) {
    System.out.println("Price must be greater than 0!");
  }
 }
 public void showInfo(String movieName, int ageLimit, double price){
    String showMovieName=movieName;
    int showAgeLimit=ageLimit;
    double showPrice=price;
    System.out.println("Movie name is: " + showMovieName);
    System.out.println("Age limit is: " + showAgeLimit);
    System.out.println("Movie price is: $" + showPrice);

 }
 

}
