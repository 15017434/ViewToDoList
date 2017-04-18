package sg.edu.rp.c346.viewtodolist;

/**
 * Created by 15017434 on 12/7/2016.
 */
public class ToDoItem {
    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public boolean isImportant() {
        return isImportant;
    }

    private String title;
    private String detail;

    @Override
    public String toString() {
        return
                title + "\n" + detail + "\n" + "Important? "+ isImportant;


    }

    public ToDoItem(String title, String detail, boolean isImportant) {
        this.title = title;
        this.detail = detail;
        this.isImportant = isImportant;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    private boolean isImportant;

    }

