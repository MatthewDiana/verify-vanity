package com.matthewdiana.verifyvanity.checkers.states;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import com.matthewdiana.verifyvanity.checkers.StateChecker;

import java.io.IOException;

public class NewYorkChecker implements StateChecker {

    private static final String FORM_URL = "https://transact2.dmv.ny.gov/PlatesPersonalized";

    private String requestedPlate;

    public NewYorkChecker(String requestedPlate) {
        this.requestedPlate = requestedPlate;
    }

    public String getRequestedPlate() {
        return requestedPlate;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public boolean isAvailable() throws IOException {
        try (final WebClient webClient = new WebClient()) {
            final HtmlPage page = webClient.getPage(FORM_URL);

            final HtmlForm form = page.getFormByName("frmGetPlateNumber");

            final HtmlRadioButtonInput radioButton = form.getInputByName("rbPlateType");
            final HtmlTextInput textField = form.getInputByName("txtPlateNum");
            final HtmlSubmitInput button = form.getInputByName("btnSubmit");

            radioButton.setChecked(true);
            textField.setValueAttribute(requestedPlate);

            final HtmlPage resultPage = button.click();

            return resultPage.asText().contains("This plate combination is available to request.");
        }
    }
}
