public class App {

    static boolean iWillReview = true;
    static boolean iWillNotFail = true;
    public static void main(String[] args) throws Exception {
    
        App myApp = new App();
        
    //precondition
        assert iWillReview == true: ("Lagot ako sa exam");
       
        myApp.study();

    //postcondition
        assert iWillNotFail == true: ("I failed this exam");
       
    }
        void study() {
        iWillNotFail = false;
    }
}

