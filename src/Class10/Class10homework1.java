package Class10;

/*
Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade
 */
public class Class10homework1 {

    public static void main(String[] args) {

        String[][] names = {
                {"Adam", "Moses", "Abraham", "Isaac"},
                {"C", "B", "A", "B"}
        };
        for (int row = 0; row < names[0].length; row++) {
                if (names[1][row].equals("A") || names[1][row].equals("B")) {
                    System.out.println(names[0][row]);
                }

        }
            }
        }



