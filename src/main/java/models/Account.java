package models;

public class Account {
    private String email;
    private String gender;
    private String firstName;
    private String lastName;
    private String password;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String companyName;
    private String addressName;
    private String cityName;
    private int stateName;
    private String zipCode;
    private int countryName;
    private String phoneNumber;
    private String alias;
    public Account(String email, String gender,
                   String firstName, String lastName,
                   String password, int birthDay,
                   int birthMonth, int birthYear,
                   String companyName, String addressName,
                   String cityName, int stateName,
                   String zipCode, int countryName,
                   String phoneNumber, String alias) {
        this.email = email;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.companyName = companyName;
        this.addressName = addressName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.zipCode = zipCode;
        this.countryName = countryName;
        this.phoneNumber = phoneNumber;
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddressName() {
        return addressName;
    }

    public String getCityName() {
        return cityName;
    }

    public int getStateName() {
        return stateName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getCountryName() {
        return countryName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAlias() {
        return alias;
    }
}

