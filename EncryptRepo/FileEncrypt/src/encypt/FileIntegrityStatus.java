/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encypt;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author boconnell
 */
public class FileIntegrityStatus
{
    
    String filename;
    boolean isDirectory = false;
    boolean isFile = false;
    private String fileType = "";
    public String[] fileFilteredNames;
    private int nosOfFiles;
    private String absolutePath = null;
    private boolean ready = false;
    
    
    
    File[] filteredFiles;
    
    File file ;

    public FileIntegrityStatus(String filename) {
        this.filename = filename;
    }

    public FileIntegrityStatus() {
        
        this.filename = "";
    }

    public FileIntegrityStatus(File aFile) throws IOException{
        
        
        this.ready = false;
        this.file = aFile;
        this.isDirectory = this.file.isDirectory();
        this.isFile = this.file.isFile();
        //this.updateFileData(aFile);
        
        
        
   }
    
    
    public void updateFileType(String currentFileType)
    {
        this.fileType = currentFileType;
    }
   
   
   
    
    public void updateFileredList()
    {
      if (this.isDirectory())  {
        FilenameFilter filter= new MyFileFilter(getFileType());
        this.filteredFiles = this.file.listFiles(filter);
        
      }
      else {
          //A single file was selected by chooser
          this.filteredFiles = new File[1];
          this.filteredFiles[0] = this.file;
      }
       updateFileNamesFromPaths();   
    }
    
    private void updateFileNamesFromPaths()
    // made this private as it depends on an update of the filtered files first
    {
        int i =0;
        this.fileFilteredNames = new String[this.filteredFiles.length];
        for(File file : this.filteredFiles)
        {
            this.fileFilteredNames[i] = file.getName();
            i++;
        }
        setNosOfFiles(i);
        System.out.println("Array length in updateFilenamesFromPath := " + this.filteredFiles.length);
    }
    
    // For debug purpose only)
    public void statusOfFileList ()
    {
        System.out.println("************DEBUG STATS *******************");
        System.out.println("File type /(Suffix)/) = " + this.getFileType());
        System.out.println("Is Directory = "+ this.isDirectory);
        System.out.println("Is File = "+ this.isFile);
        int i = 0;
        for ( File file : this.filteredFiles){
            i++;
            System.out.println("Filtered File " + i  + " =:" + file);
            
        } 
        System.out.println("Total Number of Filtered Files =: " + i);
        System.out.println("*****************END***********************");
        
    }
    
    //public int getChosenFilesCombo(){
    // make sure that this object exists before calling 
    public DefaultComboBoxModel<String> getChosenFilesCombo(){
    
        return new DefaultComboBoxModel<>(this.fileFilteredNames);
        
    }
    
    public void updateFileData()throws IOException
            
    {
        if (this.isDirectory) this.absolutePath = this.file.getAbsolutePath();
        if (this.isFile) 
        {
          this.absolutePath = this.file.getParent();
          this.filename = this.file.getName();
        }
        
        //debug line
        System.out.println("Absolute Path called by constructor = " + this.absolutePath);
        System.out.println("File name  called by constructor = " + this.filename);
        
    }
    
    
    
   
    

    public String getFilename() {
        return filename;
    }

    

    public boolean isDirectory() {
        return isDirectory;
    }

    public boolean isFile() {
        return isFile;
    }

    

    public File getFile() {
        return file;
    }

    public String getFileType() {
        return fileType;
    }

    public String[] getFileFilteredNames() {
        return fileFilteredNames;
    }

    public int getNosOfFiles() {
        return nosOfFiles;
    }

    public void setNosOfFiles(int nosOfFiles) {
        this.nosOfFiles = nosOfFiles;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
    
    
    
    
        
    
}
