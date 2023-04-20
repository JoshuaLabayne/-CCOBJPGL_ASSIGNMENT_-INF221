public class App {
    
    static boolean iwillNotCheat  = true;
    static boolean IwillWin  = true;
    public static void main(String[] args) throws Exception {
        
        enterCompetition();
        
        assert iwillNotCheat == true: "my bad"; 
        assert IwillWin  == true: "ow no";
}

    static void enterCompetition(){
        IwillWin = false;

    }
}

