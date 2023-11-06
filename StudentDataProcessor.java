public class StudentDataProcessor {
    public static void main(String[] args) {
        // Step a: Declare and initialize the "studentData" string variable
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Step b: Split the "studentData" string into an array of individual student records
        String[] studentRecords = studentData.split(", ");

        // Step c: Create arrays to store student names and scores
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];

        // Step d: Populate the arrays with data from the split records
        for (int i = 0; i < studentRecords.length; i++) {
            String[] record = studentRecords[i].split(":");
            studentNames[i] = record[0];
            studentScores[i] = Integer.parseInt(record[1]);
        }

        // Step e: Calculate the total number of students
        int totalStudents = studentNames.length;

        // Step f: Calculate the average score of all students
        int sum = 0;
        for (int score : studentScores) {
            sum += score;
        }
        double averageScore = (double) sum / totalStudents;

        // Step g: Find the highest score and the name of the student who achieved it
        int highestScore = Integer.MIN_VALUE;
        String highestScorer = "";
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                highestScorer = studentNames[i];
            }
        }

        // Step h: Find the lowest score and the name of the student who achieved it
        int lowestScore = Integer.MAX_VALUE;
        String lowestScorer = "";
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                lowestScorer = studentNames[i];
            }
        }

        // Step i: Display the calculated statistics
        System.out.println("Total number of students: " + totalStudents);
        System.out.println("Average score of all students: " + averageScore);
        
        System.out.println("Highest score: " + highestScore);
        System.out.println("Achieved by: " + highestScorer);
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Achieved by: " + lowestScorer);
    }
}
