public class testOne {
    enum weekday{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args) {
        weekday day=weekday.SUNDAY;
        System.out.println(day);
        for(weekday d:weekday.values()){
            switch (d){
                case MONDAY:System.out.println("today is workday");break;
                case TUESDAY:System.out.println("today is workday");break;
                case WEDNESDAY:System.out.println("today is workday");break;
                case THURSDAY:
                    System.out.println("today is workday");break;
                case FRIDAY:System.out.println("today is workday");break;
                case SATURDAY:System.out.println("today is holiday");break;
                case SUNDAY:System.out.println("today is holiday");break;
                default:
                    throw new RuntimeException("can not"+day);
            }
        }
    }
}
