package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200;   // private 로 되어서 접근이 불가능함.(volume has private access in access.Speaker)
        speaker.showVolume();
    }
}
