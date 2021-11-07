package com.coresoft.alltools;

import android.content.Context;

public class CoresoftGetter {
   
    /**Returns a static instance of {@link com.coresoft.alltools.PictureGet} */
    public static com.coresoft.alltools.PictureGet withPictureContex(Context contx){
        return com.coresoft.alltools.PictureGet.getInstance(contx);
    }
    
   
    public static void Initialize(){
    
    }
    
    /** scans all media content on device */
    private void ScanAllMedia(){
    
    }
    
    /** save general information about all media on de vice in  */
    private void UpdateGeneralMediaInfo(){
    
    }
    
    public static void DeleteMedia(String mediaId,String mediaType){
    
    }
    
    public static void RenameMedia(String mediaId,String mediaType){
    
    }
    
}