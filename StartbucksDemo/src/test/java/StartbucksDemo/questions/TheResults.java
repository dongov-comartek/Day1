package StartbucksDemo.questions;


import net.serenitybdd.screenplay.Question;

public class TheResults {
    public static Question<String> ErrorEmail() {
        return new SignInErrorEmail();
    }
    public static Question<String> ErrorPass(){
        return new SignInErrorPass();
    }
    public static Question<Boolean> TitleTeam(){
        return new TitleTeams();
    }

}