package software.ulpgc.katas.adapters;

public class UserDto {
    public String gender;
    public Picture picture;
    public Name name;
    public Location location;
    public String email;
    public Dob dob;

    public class Name {
        public String title;
        public String first;
        public String last;
    }

    public class Location {
        public Street street;
        public String city;
        public String state;
        public String country;
        public String postcode;
        public Coordinates coordinates;
    }

    public class Street {
        public int number;
        public String name;
    }

    public class Coordinates {
        public double latitude;
        public double longitude;
    }

    public class Dob {
        public String date;
        public int age;
    }

    public class Picture {
        public String large;
        public String medium;
    }



}
