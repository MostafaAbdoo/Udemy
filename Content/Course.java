package Content;

import java.util.List;

public class Course {
    private String courseName , instructorName, year, description;
    private int price, students, videos, length;
    List<Video> videoList;
    Course(String courseName , String instructorName, String year, String description, int price, int students, int videos, int length){
        this.courseName=courseName;
        this.instructorName=instructorName;
        this.year=year;
        this.description=description;
        this.price=price;
        this.students=students;
        this.videos=videos;
        this.length=length;
    }
    protected void addVideo(String videoName,String courseName,String instructorName,String description, int length){
        Video video = new Video(videoName, courseName, instructorName, description, length);
        videoList.add(video);
    }
    protected void removeVideo(String videoName){
        for(int i=0;i<videoList.size();i++){
            if(videoList.get(i).getVideoName()==videoName){
                videoList.remove(i);
            }
        }
    }


}
