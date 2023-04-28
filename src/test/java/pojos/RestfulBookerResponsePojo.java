package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestfulBookerResponsePojo {

    public RestfulBookerResponsePojo() {
    }

    private Integer bookingid;
    private RestfulBookerRequestPojo booking;

    public RestfulBookerResponsePojo(Integer bookingid, RestfulBookerRequestPojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public RestfulBookerRequestPojo getBooking() {
        return booking;
    }

    public void setBooking(RestfulBookerRequestPojo booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }

}
