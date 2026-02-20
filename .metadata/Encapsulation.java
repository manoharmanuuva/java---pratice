public class Encapsulation {
    private int rollnumber;
    private boolean attendence;

    public void student(int rollnumber){
        this.rollnumber = rollnumber;
    }

    public void attendence(boolean attend){
        attendence = attend;
        System.out.println("the teacher assigned attendence");
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public boolean isAttendence() {
        return attendence;
    }

    public static void main(String[] args) {
        Encapsulation m = new Encapsulation();
        m.student(101);
        m.attendence(true);

        System.out.println("Roll Number: " + m.getRollnumber());
        System.out.println("Attendance: " + m.isAttendence());
    }
}
