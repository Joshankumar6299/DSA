package oops;

public class GetterSetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(19);
        s1.setEnroll(22);
        System.out.println("Name: " + s1.getName());
        System.out.println("Enrollment no: " + s1.getEnroll());
        System.out.println("Age :"+ s1.getAge());
    }
    

static class Student {
        public String name;
        private  int age;
        private int enrollmentNumber;
        
        public void setName(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        public void setEnroll(int enrollmentNumber) {
            this.enrollmentNumber = enrollmentNumber;
        }
        public int getEnroll(){
            return enrollmentNumber;
        }
    }
}
