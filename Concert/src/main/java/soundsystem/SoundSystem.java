/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundsystem;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Fadly TR
 */
public class SoundSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("TrackCounter.xml");
        BlankDisc BD = ctx.getBean("cd", BlankDisc.class);
        BD.playTrack(2);
//        BlankDisc cd = new BlankDisc();
//        cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
//        cd.setArtist("The Beatles");
//        List<String> tracks = new ArrayList<String>();
//        tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
//        tracks.add("With a Little Help from My Friends");
//        tracks.add("Lucy in the Sky with Diamonds");
//        tracks.add("Getting Better");
//        tracks.add("Fixing a Hole");
//        cd.setTracks(tracks);
//        cd.playTrack(2);
//        TrackCounter trackCounter = ctx.getBean("trackCounter", TrackCounter.class);
//        trackCounter.getPlayCount(3);
//        trackCounter.countTrack(2);
    }

}
