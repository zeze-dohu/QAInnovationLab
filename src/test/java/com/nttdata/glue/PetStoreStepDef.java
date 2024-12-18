package com.nttdata.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PetStoreStepDef {
    public PetStoreStepDef() {
        @Given("la url es {string}")  {
        }
        @When("^consulto la mascota con ID \"([^\"]*)\"$", (String arg0) -> {
        });
        @Then() Then("^valido el codigo de respuesta sea (\\d+)$", (Integer arg0) -> {
        });
    }
}
