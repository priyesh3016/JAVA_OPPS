class Teacher {
    // 3 properties
    int rollNo;
    int age;
    String grade;

    // 1. Default (non-parameterized) constructor
    Teacher() {
        rollNo = 0;
        age = 0;
        grade = "Not Assigned";
    }

    // 2. Parameterized constructor
    Teacher(int rollNo, int age, String grade) {
        this.rollNo = rollNo;
        this.age = age;
        this.grade = grade;
    }

    // 3. Copy constructor
    Teacher(Teacher s) {
        this.rollNo = s.rollNo;
        this.age = s.age;
        this.grade = s.grade;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        // Using non-parameterized constructor
    	Teacher s1 = new Teacher();
        s1.display();

        // Using parameterized constructor
        Teacher s2 = new Teacher(101, 16, "10th");
        s2.display();

        // Using copy constructor
//        Student s3 = new StudentOne(s2);
//        s3.display();
    }
}
