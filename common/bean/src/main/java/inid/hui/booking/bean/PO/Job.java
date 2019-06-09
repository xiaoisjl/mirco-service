package inid.hui.booking.bean.PO;

import com.baomidou.mybatisplus.annotation.TableId;

public class Job {

    @TableId
    private Long id;

    private String location;

    private Status status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        TODO,
        COMPLETED
    }
}
