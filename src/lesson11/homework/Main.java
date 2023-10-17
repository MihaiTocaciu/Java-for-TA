package lesson11.homework;

class InvalidFileException extends Exception {
    public InvalidFileException(String message) {
        super(message);
    }
}
     class Student {
        String name;
        String[] files;
        int score;

        public Student(String name, String[] files) {
            this.name = name;
            this.files = files;
            this.score = 0;
        }
    }

    public class Main {
        public static int checkFileExtension(String fileName) throws InvalidFileException {
            if (fileName == null || fileName.isEmpty()) {
                throw new InvalidFileException("File name is null or empty");
            }

            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        }

        public static void main(String[] args) {
            Student student1 = new Student("John", new String[]{"Homework1.java", "Homework12.java", "README.txt", null, "Task1.java"});
            Student student2 = new Student("Alice", new String[]{"Homework.doc", "Assignment.java", null, "Lecture.java", "FirstProject.cpp"});
            Student student3 = new Student("Bob", new String[]{"Project.java", "Solution.java", "Code.java", "Program.java", "Main.java"});

            Student[] students = {student1, student2, student3};

            for (Student student : students) {
                int totalScore = 0;
                for (String file : student.files) {
                    try {
                        int fileScore = checkFileExtension(file);
                        totalScore += fileScore;
                    } catch (InvalidFileException e) {
                        System.out.println("Error for " + student.name + ": " + e.getMessage());
                        totalScore -= 1;
                    }
                }
                student.score = totalScore;
                System.out.println(student.name + " scored " + student.score + " points");
            }
        }
    }
