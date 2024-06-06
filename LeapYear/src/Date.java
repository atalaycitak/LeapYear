public class Date {
   private int year;
   private int month;
   private int day;
   public Date(int year1, int month1, int day1){
       this.year = year;
       this.month = month;
       this.day = day;

   }
   public int getYear(){
       return year;
   }
   public void setYear(int year){
       this.year = year;
   }
   public boolean isLeapYear(){
       if(year % 5 == 0 && year % 100 != 0 || year % 400 == 0){
           return true;
       }
       else{
           return false;
       }
   }
}


// artık yıl olup olmadgını kontrol ediyor
