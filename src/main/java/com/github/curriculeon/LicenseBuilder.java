package com.github.curriculeon;

import java.util.Date;

public class LicenseBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date issueDate;
    private Date expiresDate;
    private Boolean isMinor;
    private Character licenseClass;
    private Character endorsement;

    public LicenseBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public LicenseBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public LicenseBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LicenseBuilder setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public LicenseBuilder setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public LicenseBuilder setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
        return this;
    }

    public LicenseBuilder setIsMinor(Boolean isMinor) {
        this.isMinor = isMinor;
        return this;
    }

    public LicenseBuilder setLicenseClass(Character licenseClass) {
        this.licenseClass = licenseClass;
        return this;
    }

    public LicenseBuilder setEndorsement(Character endorsement) {
        this.endorsement = endorsement;
        return this;
    }

    public License createLicense() {
        return new License(id, firstName, lastName, birthDate, issueDate, expiresDate, isMinor, licenseClass, endorsement);
    }
}