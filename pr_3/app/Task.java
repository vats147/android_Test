public class Task {
    private long id;
    private String date;
    private String time;
    private String description;

    public Task(String date, String time, String description) {
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }
}
