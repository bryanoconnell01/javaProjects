package encypt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boconnell
 */

import java.io.File; 
import java.io.FilenameFilter; 



public class MyFileFilter implements FilenameFilter {

private String suffix = null;

MyFileFilter (String ending){
    
    this.suffix = ending.toLowerCase();
    
    
}

@Override 
public boolean accept(File directory, String fileName) { 
        boolean allow = false;
          
        if (fileName.toLowerCase().endsWith(this.suffix) || this.suffix.equals("all") ) { 
            
            allow = true; 
        } 
        return allow; 
    } 



    
}
