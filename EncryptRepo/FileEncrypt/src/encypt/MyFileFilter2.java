/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encypt;


import java.io.File; 

import java.io.FilenameFilter; 

public class MyFileFilter2 implements FilenameFilter { 
    
    private final String ext;
    MyFileFilter2(String End){
        this.ext = End;
        
        
    }
    @Override 
    public boolean accept(File directory, String fileName) { 
        if (fileName.endsWith(this.ext)) { 
            return true; 
        } else
        return false; 
    }
}

