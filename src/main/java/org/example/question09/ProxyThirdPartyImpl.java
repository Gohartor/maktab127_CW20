package org.example.question09;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class ProxyThirdPartyImpl implements ThirdParty{

    private final RealThirdPartyImpl rtp;

    private List<Video> proxyVideos;

    @Override
    public List<Video> listVideos() {
        if(proxyVideos==null){
            proxyVideos = rtp.listVideos();
            //copy to proxy
        }
        return proxyVideos;
    }


    public String getVideoInfo(Integer videoId, User user) {
        if(isAuthenticated(user)){
            if (listVideos().stream().anyMatch(video -> video.getId().equals(videoId))) {
                return listVideos().get(videoId).toString();
            }
            throw new RuntimeException("Video not found");
        }
        throw new RuntimeException("Access denied");
    }

    public String downloadVideo(Integer videoId) {
        if (listVideos().stream().anyMatch(video -> video.getId().equals(videoId))) {
            return listVideos().get(videoId).getLink();
        }
        throw new RuntimeException("Video not found");
    }

    public boolean isAuthenticated(User user){
        return user.getType().equals(TypeUser.ADMIN);
    }

}
