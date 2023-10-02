package baitap.baitaptonghop.ra.run;

import baitap.baitaptonghop.ra.sevice.Student;


import java.util.*;

 public class StudentManagerment {
    private int idSt = 1;
    Scanner scanner = new Scanner(System.in);
    private List<Student> students;

    public StudentManagerment() {
        students = new ArrayList<>();
    }

    public void addStudent() {
        Student student = new Student();
        student.input();
        students.add(student);

        student.setStudentId(idSt++);
        System.out.println("Học sinh đã được thêm mới.");
    }


    public void editStudent(int idStundent) {

        for (Student st : students
        ) {
            if (st.getStudentId() == idStundent) {
                st.input();
                System.out.println("Thông tin học sinh đã được cập nhập !!");
                break;
            }
        }
        System.out.println("Không tìm thấy học sinh có mã sv là: " + idStundent);
    }

    public void displayStudents() {
        for (Student student : students) {
            student.display();
            System.out.println("----------");
        }
    }



        public void deleteStudent(int studentId) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getStudentId() == studentId) {
                    students.remove(i);
                    System.out.println("Học sinh đã được xóa.");
                    return;
                }
            }
            System.out.println("Không tìm thấy học sinh có mã " + studentId);
        }

     public void searchStudent(int studentId) {
         for (Student student : students) {
             if (student.getStudentId() == studentId) {
                 student.display();
                 return;
             }
         }
         System.out.println("Không tìm thấy học sinh có mã " + studentId);
     }
     public void sortByNameAZ() {
        students.sort(Comparator.comparing(Student::getStudentName));
         System.out.println("Danh sách học sinh đã được sắp xếp theo điểm tăng dần");
         displayStudents();
     }
     public void sortByMarkAsc() {
         Collections.sort(students, Comparator.comparing(Student::getMark));
         System.out.println("Danh sách học sinh đã được sắp xếp theo điểm tăng dần");
         displayStudents();
     }
     public void sortByMarkDesc() {
         Collections.sort(students, Comparator.comparing(Student::getMark).reversed());
         System.out.println("Danh sách học sinh đã được sắp xếp theo điểm giảm dần");
         displayStudents();
     }
    public static void main(String[] args) {

        StudentManagerment studentManagerment = new StudentManagerment();
        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("********** Student Management ************");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Sửa học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh theo studentId");
            System.out.println("5. Sắp xếp theo tên học sinh từ a-z");
            System.out.println("6. In ra danh sách học sinh");
            System.out.println("7. Sắp xếp điểm tăng dần");
            System.out.println("8. Sắp xếp điểm giảm dần");
            System.out.println("9. Thoát");
            System.out.println("Chọn chức năng (1-9): ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studentManagerment.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập mã học sinh cần sửa: ");
                    int editId =Integer.parseInt(scanner.nextLine());
                    studentManagerment.editStudent(editId);
                    break;
                case 3:
                    System.out.println("Nhập mã học sinh cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    studentManagerment.deleteStudent(deleteId);
                    break;
                case 4:
                    System.out.println("Nhập mã học sinh cần tìm: ");
                    int searchId =Integer.parseInt(scanner.nextLine());
                    studentManagerment.searchStudent(searchId);
                    break;
                case 5:
                    studentManagerment.sortByNameAZ();
                    break;
                case 6:
                    studentManagerment.displayStudents();
                    break;
                case 7:
                    studentManagerment.sortByMarkAsc();
                    break;
                case 8:
                    studentManagerment.sortByMarkDesc();
                    break;
                case 9:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;


            }
        } while (choice != 9);
    }
}
