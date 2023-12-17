package xiangqi;

public class Main_Board_test {
    public static void main(String[] args) {







        Echiquier board = new Echiquier();
        board.debuter();

        System.out.println("0     1     2     3     4     5     6     7     8");

        for(int ligne = 0; ligne < 10; ligne++){
            for (int colonne = 0; colonne <9 ; colonne++) {
                if(board.getJeu()[ligne][colonne].piece==null){
                    System.out.println("*");
                }
                else{
                    System.out.println(board.getJeu()[ligne][colonne].piece.getNom());
                }
            }
        }
    }
}
