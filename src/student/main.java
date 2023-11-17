
package student;


public class main {
    

    public static void main(String[]args){
        student student = new student();
        
        student.name = "Jethro Jay U. Balaga";
        student.section = student.setSection();
        student.motto = student.getMotto();
        
        System.out.println(student.name);
        System.out.println(student.section);
        System.out.println(student.motto);
    }
}
