package org.example.question09;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class RealThirdPartyImpl implements ThirdParty {

    protected static final List<Video> realVideos = new ArrayList<>();

    @Override
    public List<Video> listVideos() {
        return realVideos;
        //select * from videos
    }

}
