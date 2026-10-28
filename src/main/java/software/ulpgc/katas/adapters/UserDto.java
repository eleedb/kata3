package software.ulpgc.katas.adapters;

public class UserDto {
    public String gender;
    public Picture picture;
    public Name name;
    public Location location;
    public String email;
    public Dob dob;

    private class Name {
        public String title;
        public String first;
        public String last;
    }

    private class Location {
        public Street street;
        public String city;
        public String state;
        public String country;
        public String postcode;
        public Coordinates coordinates;
    }

    private class Street {
        public int number;
        public String name;
    }

    private class Coordinates {
        public double latitude;
        public double longitude;
    }

    private class Dob {
        public String date;
        public int age;
    }

    private class Picture {
        public String large;
        public String medium;
    }



}
