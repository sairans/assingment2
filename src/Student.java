class Student extends Person {
    private double gpa;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}