package Content;

public class Video {
    private String videoName, courseName,instructorName,description;
    private int length;
    Video(String videoName , String courseName , String instructorName, String description, int length){
        this.videoName=videoName;
        this.courseName=courseName;
        this.instructorName=instructorName;
        this.description=description;
        this.length=length;
    }
    String getVideoName(){
        return videoName;
    }
}
