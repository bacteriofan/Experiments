package patterns.builder;

class AlertDialogAnotherImplementation {
    private String title;
    private String text;
    private String applyButton;
    private String cancelButton;


    class Builder {

        Builder() {}

        Builder setTitle(String title) {
            AlertDialogAnotherImplementation.this.title = title;
            return this;
        }

        Builder setText(String text) {
            AlertDialogAnotherImplementation.this.text = text;
            return this;
        }

        Builder setApplyButton(String applyButton) {
            AlertDialogAnotherImplementation.this.applyButton = applyButton;
            return this;
        }

        Builder setCancelButton(String cancelButton) {
            AlertDialogAnotherImplementation.this.cancelButton = cancelButton;
            return this;
        }

        AlertDialogAnotherImplementation build() {
            return AlertDialogAnotherImplementation.this;
        }
    }
}