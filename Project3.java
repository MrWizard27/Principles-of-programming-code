public class Project3{

  public static Boolean WhichLarger(int bday, int bmonth){
    if (bday > bmonth) {
    return true ;
    }
    else if (bday < bmonth) {
    return false ;
    }
    else {
    return true ;
    }
}
  public static int Difference(int bday, int bmonth){
    Boolean size = WhichLarger(bday, bmonth);
    if (size == true){
      return bday - bmonth ;
    }
    else if (size == false){
      return bmonth - bday ;
    }
    else {
      return bday - bmonth ;
    }
}
  public static Double Circumference(int bday, int bmonth){
    double radius = bday + bmonth ;
    return Math.PI * radius * radius ;
}
  public static Double Area(int bday, int bmonth){
    double Area_Rectangle = bday * bmonth ;
    return Area_Rectangle ;
}
public static void Say(int bday, int bmonth, boolean wl, int diff, double circ, double a){
    System.out.println("Day of Birth:" + bday);
    System.out.println("Month of Birth:" + bmonth);
    if (wl == true){
      System.out.println("The Larger number is the day of birth at " + bday);
    }
    else {
      System.out.println("The Larger number is the month of birth at " + bmonth);
    }
    System.out.println("The difference between the Day of Birth and the Month of Birth is " + diff);
    System.out.println("The Circumference is " + circ);
    System.out.println("The area is " + a);
}
  public static void main(String[] args){
    int bday = 27 ;
    int bmonth = 9 ;
    //wl = Which is Larger
    boolean wl  = WhichLarger(bday, bmonth);
    //diff = Difference
    int diff = Difference(bday, bmonth);
    //circ = Circumference
    double circ = Circumference(bday, bmonth);
    //a = Area
    double a = Area(bday, bmonth);
    Say(bday, bmonth, wl, diff, circ, a);
  }
}
