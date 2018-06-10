package json.xml.example;

public class Person {
    private int id;
    private String name;
    private Address address;
    private long[] mobilePhoneNumbers;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public long[] getMobilePhoneNumbers() {
        return mobilePhoneNumbers;
    }
    public void setMobilePhoneNumbers(long[] mobilePhoneNumbers) {
        this.mobilePhoneNumbers = mobilePhoneNumbers;
    }
}
