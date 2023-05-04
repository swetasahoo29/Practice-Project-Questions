//Dependency Inversion principle- High level modules should not depend (tightly coupled) on low level modules. Both should depend on abstractions rather than concrete method.
//CustomerBusinessLogic depends on the DataAccess class, so CustomerBusinessLogic is a high-level module and DataAccess is a low-level module. So, as per the first rule of DIP, CustomerBusinessLogic should not depend on the concrete DataAccess class, instead both classes should depend on abstraction.
// High-level module
class VideoPlayer {
    private final AnimalVideo AnimalVideo;

    public VideoPlayer(AnimalVideo AnimalVideo) {
        this.AnimalVideo = AnimalVideo;
    }

    public void play() {
        AnimalVideo.play();
    }
}

// Low-level module
class Lion implements AnimalVideo {
    @Override
    public void play() {
        System.out.println("Playing lions video");
    }
}

class Tiger implements AnimalVideo {
    @Override
    public void play() {
        System.out.println("Playing tigers video");
    }
}


// Abstraction
interface AnimalVideo {
    void play();
}


public class Dip {
    public static void main(String[] args) {
        AnimalVideo tiger = new Tiger();
        VideoPlayer videoPlayer = new VideoPlayer(tiger);
        videoPlayer.play();

    }
}