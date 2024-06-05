public class Main {
    public static void main(String[] args) {
    Date date = new Date(2023, 3,06);
    System.out.println("date is" + date);
    System.out.println("year is" + date.getYear());
    System.out.println("Is year leap year:" + date.isLeapYear());

    date.setYear(2024);
    System.out.println("updated year is" + date.getYear());
    System.out.println("year is" + date.getYear());
    System.out.println("is updated year is leap year ;" + date.getYear());




    }
}
