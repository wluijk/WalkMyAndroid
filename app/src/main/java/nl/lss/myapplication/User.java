package nl.lss.myapplication;


import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

@IgnoreExtraProperties
public class User {

    public String first;
    public String last;
    public Date born;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String first, String last, Date born) {
        this.first = first;
        this.last = last;
        this.born = born;
    }
}