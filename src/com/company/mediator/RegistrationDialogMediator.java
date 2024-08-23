package com.company.mediator;

class RegistrationDialogMediator implements DialogMediator {
    private TextField nameField;
    private TextField emailField;
    private TextField passwordField;
    private Checkbox termsCheckbox;
    private Button submitButton;
    private Button resetButton;
    private Label errorMessageLabel;

    public void registerComponents(TextField nameField, TextField emailField, TextField passwordField,
                                   Checkbox termsCheckbox, Button submitButton, Button resetButton, Label errorMessageLabel) {
        this.nameField = nameField;
        this.emailField = emailField;
        this.passwordField = passwordField;
        this.termsCheckbox = termsCheckbox;
        this.submitButton = submitButton;
        this.resetButton = resetButton;
        this.errorMessageLabel = errorMessageLabel;
    }

    @Override
    public void notify(Component component, String event) {
        if (component == nameField || component == emailField || component == passwordField || component == termsCheckbox) {
            validateForm();
        } else if (component == resetButton) {
            resetForm();
        } else if (component == submitButton) {
            submitForm();
        }
    }

    private void validateForm() {
        boolean isFormValid = !nameField.getText().isEmpty() && !emailField.getText().isEmpty()
                && !passwordField.getText().isEmpty() && termsCheckbox.isChecked();
        submitButton.setEnabled(isFormValid);
        if (!isFormValid) {
            errorMessageLabel.setText("Please fill all fields and accept terms.");
        } else {
            errorMessageLabel.setText("");
        }
    }

    private void resetForm() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        termsCheckbox.setChecked(false);
        errorMessageLabel.setText("");
        submitButton.setEnabled(false);
    }

    private void submitForm() {
        if (submitButton.isEnabled()) {
            System.out.println("Form submitted: Name = " + nameField.getText() +
                    ", Email = " + emailField.getText());
            resetForm();
        } else {
            errorMessageLabel.setText("Cannot submit the form. Please fill all fields and accept terms.");
        }
    }
}

