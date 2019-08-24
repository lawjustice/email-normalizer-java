package com.yan.adhi.wiranata;

public class EmailAddress {
    private String domain;
    private String username;
    private iProvider provider;

    EmailAddress(String email) {
        String[] splitEmail = email.split("@");
        this.username = getPartOfArray(splitEmail, 0);
        this.domain = getPartOfArray(splitEmail, 1);
        normalize();
    }

    private void normalize() {
        this.provider = ProviderFactory.getProvider(this.domain);
        modifyEmail();
    }

    private String getPartOfArray(String[] splittedWord, int index) {
        if (index > -1 && index < splittedWord.length) {
            return splittedWord[index];
        }
        return "";
    }

    private void modifyEmail() {
        this.provider.getModifications().forEach((mod) -> {
            switch(mod) {
                case LOWERCASE: lowercase(); break;
                case REMOVE_PLUS_PART: removePlusPart(); break;
                case REMOVE_DOTS: removeDots(); break;
                case REMOVE_HYPEN_PART: removeHypePart(); break;
            }
        });
    }

    private void lowercase() {
        this.username = this.username.toLowerCase();
    }

    private void removeDots() {
        this.username = this.username.replace(".", "");
    }

    private void removePlusPart() {
        this.username = getPartOfArray(this.username.split("/+", 2), 0);;
    }

    private void removeHypePart() {
        this.username = getPartOfArray(this.username.split("-", 2), 0);
    }

    public String getNormalizeEmail() throws Exception {
        String email = this.username + this.domain;
        if (email.isEmpty())
            throw new Exception("email is empty");
        return email;
    }
}
