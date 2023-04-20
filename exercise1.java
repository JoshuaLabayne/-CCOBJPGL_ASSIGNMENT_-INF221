public class App {
    
    static boolean iwillNotCheat  = true;
    static boolean IwillWin  = true;
    public static void main(String[] args) throws Exception {
        assert iwillNotCheat == true: "my bad"; 
        
        enterCompetition();

        assert IwillWin  == true: "ow no";
    }

    static void enterCompetition(){
        IwillWin = false;

    }
}

