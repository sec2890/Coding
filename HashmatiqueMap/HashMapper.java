package HashmatiqueMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapper{
    public void retriveSongData(){  
        HashMap<String, String> songMap = new HashMap<String, String>();
        songMap.put("Lose Yourself", "There's vomit on his sweater already, mom's spaghetti.");
        songMap.put("Blackbird", "Blackbird singing in the dead of night.");
        songMap.put("Man in the Mirror", "I'm starting with the man in the mirror.");
        songMap.put("Sugar", "And it's killing me when you're away.");

        String single = songMap.get("Man in the Mirror");
        System.out.println(single);

        Set<String> keys = songMap.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(songMap.get(key));
        }
    }
}