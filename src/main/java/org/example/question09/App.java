package org.example.question09;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Video video1 = new Video(1,"link1");
        Video video2 = new Video(2, "link2");
        Video video3 = new Video(3, "link3");
        Video video4 = new Video(4, "link4");
        Video video5 = new Video(5, "link5");

        List<Video> videos = new ArrayList<>();
        videos.add(video1);
        videos.add(video2);
        videos.add(video3);
        videos.add(video4);
        videos.add(video5);


        ProxyThirdPartyImpl ptp = new ProxyThirdPartyImpl(new RealThirdPartyImpl());


    }
}
