package Amazon.questions;

import net.serenitybdd.screenplay.Question;

public class TheResults {
    public static Question<Boolean> verifyProductName() {
        return new ProductName();
    }
    public static Question<Boolean> verifyProductDesc() {
        return new ProductDesc();
    }
    public static Question<Boolean> verifyPrice() {
        return new Price();
    }
}
