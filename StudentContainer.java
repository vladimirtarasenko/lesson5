package by.Itacademy.OOP_in_Java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class StudentContainer implements IPeopleInfo, ISearchPeopleInfo, IMiddleAge {

    public List<Student> students = new LinkedList<Student>();

    @Override
    public void inputPeopleInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Enter Student name :");
            student.name = scanner.nextLine();
            System.out.println("Enter Student Surname :");
            student.surname = scanner.nextLine();
            System.out.println("Enter student birthday in following way: dd-MM-yyyy:");
            String birthDateString = scanner.nextLine();
            try {
                student.dateOfBirth = ft.parse(birthDateString);
                students.add(student);
            } catch (ParseException e) {
            }
        }
    }

    @Override

    public boolean SearchPeopleInfo(String searchText) {
        boolean isStudentExists = false;
        for (Student student : students) {
            if (student.name.equals(searchText) || student.surname.equals(searchText)) {
                System.out.println("Student " + searchText + "'s birthday is " + student.dateOfBirth);
                isStudentExists = true;
            }
        }
        return isStudentExists;

    }

    @Override
    public void printMiddleAgeCalculation() {
        long buffer = 0;
        for (Student student : students) {
            buffer += student.dateOfBirth.getTime();
        }
        buffer = buffer / students.size();
        Date lastDate = new Date();
        Calendar c = new GregorianCalendar();
        Calendar clast = new GregorianCalendar();
        lastDate.setTime(buffer);
        clast.setTime(lastDate);

        System.out.println("Average students age - years: " + (c.get(Calendar.YEAR)-clast.get(Calendar.YEAR)) + " month: " + (c.get(Calendar.MONTH)-clast.get(Calendar.MONTH)) + " days: " + (c.get(Calendar.DAY_OF_WEEK)-clast.get(Calendar.DAY_OF_WEEK)) + " hours : " + (c.get(Calendar.HOUR_OF_DAY)-clast.get(Calendar.HOUR_OF_DAY)) + " minutes: " + (c.get(Calendar.MINUTE)-clast.get(Calendar.MINUTE)));
    }
}