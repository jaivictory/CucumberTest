import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}


 class MyStepdefs {
    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void todayIs(String today) {
        this.today = today;
        System.out.println ("Today is friday");
    }

    @When("i ask wheter it's friday yet")
    public void iAskWheterItSFridayYet() {
        System.out.println ("Is it friday yet?");
        actualAnswer = IsItFriday.isItFriday (today);
    }

     @Then("i should be told {string}")
     public void iShouldBeTold(String arg0) {
         Assert.assertEquals (actualAnswer,arg0);
     }
}
