package com.ambow.st.user;
import java.io.File;

import org.eclipse.ecf.protocol.bittorrent.TorrentFile;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        String path = "D:\\document\\Downloads\\DragonTV.IPARTMENT.S02.Complete.720p.HDTV.x264-CHDTV.torrent";
        
        TorrentFile file = new TorrentFile(new File(path));
        String[] strs = file.getFilenames();
        long[] longs = file.getLengths();
        for (int i = 0; i < strs.length; i++) {
        	File file2 = new File("D:\\"+strs[i]);
        	file.save(file2);
			
		}
        
        System.out.println(strs.length + " " + longs.length);
        
        for(int i = 0; i < strs.length; i ++)
        {
            System.err.println(strs[i] + " --->  " + longs[i]);
        }
        
        
    }
}