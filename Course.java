package Task10;

public class Course {
    public double calculateGrade(int assignments, int exams) {
        return 0;
    }

    public static void main(String[] args) {
        int assignments = 84;
        int exams = 82;

        Course c;

        c = new ProgrammingCourse();
        System.out.println("Programming Course Grade: " + c.calculateGrade(assignments, exams));

        c = new MathematicsCourse();
        System.out.println("Mathematics Course Grade: " + c.calculateGrade(assignments, exams));

        c = new DesignCourse();
        System.out.println("Design Course Grade: " + c.calculateGrade(assignments, exams));
    }
}
    class ProgrammingCourse extends Course {
        @Override
        public double calculateGrade(int assignments, int exams)
        {
            return (assignments*0.35) + (exams*0.65);
        }
    }

    class MathematicsCourse extends Course {
        @Override
        public double calculateGrade(int assignments, int exams)
        {
            return (assignments*0.4) + (exams*0.6);
        }
    }

    class DesignCourse extends Course {
        @Override
        public double calculateGrade(int assignments, int exams)
        {
            return (assignments*0.3) + (exams*0.7);
        }
    }
