

public class Game {
    private Champion champion;
    public void run(){
       champion = DatabaseIO.pickARandomChampion();
       displayChampion(champion);
    }

    private void displayChampion(Champion champion){
        System.out.println("Name: " + Color.ANSI_BLUE + champion.getName() + Color.ANSI_RESET);
        System.out.println("Gender: " + Color.ANSI_BLUE + champion.getGender() + Color.ANSI_RESET);
        System.out.println("Role: " + Color.ANSI_BLUE + champion.getRole() + Color.ANSI_RESET);
        System.out.println("Resource: " + Color.ANSI_BLUE + champion.getResource() + Color.ANSI_RESET);
        System.out.println("Range Type: " + Color.ANSI_BLUE + champion.getRangeType() + Color.ANSI_RESET);
    }
}
