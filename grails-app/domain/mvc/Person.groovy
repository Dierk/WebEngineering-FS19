package mvc

class Person {

    String firstName
    String lastName

    String toString() { "$firstName $lastName" }

    static constraints = {
        firstName blank:false
        lastName  blank:false
    }
}
