package mvc

import grails.rest.Resource

@Resource(uri="/bookings")
class Booking {

    Room   room
    Person booker
    String timeSlot
    Date   bookingDate

    String toString() { "$booker: $room, $bookingDate $timeSlot"}

    static constraints = {
        room()
        booker()
        timeSlot inList: ["AM", "PM1", "PM2"]
        bookingDate()
    }
}
