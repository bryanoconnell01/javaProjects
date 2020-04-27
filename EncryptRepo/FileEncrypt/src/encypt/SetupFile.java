/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  * https://netbeans.org/kb/docs/java/editor-codereference.html  // code assistance
 */
package encypt;

import javax.swing.DefaultComboBoxModel;
import java.util.Calendar;

/**
 *
 * @author boconnell
 */
public class SetupFile {
    
    private static final String[] FILE_SUFFIX = {"ALL",".jpg", ".pdf", ".txt", ".ppt", ".doc", "type1", "type2", ".pptx", "jnt" , "type3"};
    
    public static final String FILE_PATH = "D:\\Dropbox\\photos2\\MariKrakow";
    
    public static  DefaultComboBoxModel<String> dvdFormat;
    public static int twenty = 20;
    private static final String[] DVDSET = {"Film", "TV Series", "BBC TV Series", "US TV Series", "US Boxset", "UK Boxset", "Documentry"};
    private static final String[] STUDIO = {"BBC", "HBO", "Lionsgate", "UK", "US", "European", "Scandanavian", "Foreign"};
    private static final String[] GENRE_1 = {"Drama", "Romantic", "Comedy", "Romcom", "Thriller", "Crime", "True Story", "Gangster", "Documentary",
                                                "Bio"};
    private static final String[] GENRE_2 = {"NA","Drama", "Romantic", "Comedy", "Romcom", "Thriller", "Crime", "True Story", "Gangster", "Documentary",
                                                "Bio"};
    private static final String[] GENRE_3 = {"NA","Drama", "Romantic", "Comedy", "Romcom", "Thriller", "Crime", "True Story", "Gangster", "Documentary",
                                                "Bio"};
    private static final Integer[] DISC_SET = {1,2,3,4,5,6,7,8,9,10};
    private static final String[] SERIES = {"N/A","1","2","3","4","5","6","7","8","9","10","11","12"};
    private static final Integer[] YEAR_LIST = calculateYearList();// calculated
    private static final int YEAR_LIST_SIZE = 75;  // defines length of YEAR_LIST in years 
    private static final String[] FORMAT = {"DVD", "BluRay", "MP4", "Other"};
    private static final String[] EPISODES = {"Film","TV Series","Film Boxset", "TV Boxset"};
    
    SetupFile()
    {
        SetupFile.dvdFormat = SetupFile.dvdFormatTypes();
        
        
        
    }
    
    // remember the name of this method is getFileSuffix()
    public static DefaultComboBoxModel<String> getFileSuffix(){
        
        return new DefaultComboBoxModel<>(SetupFile.FILE_SUFFIX);
        
    }
    
    public static DefaultComboBoxModel<String> getGenre1(){
        
        return new DefaultComboBoxModel<>(SetupFile.GENRE_1);
        
    }
    
    public static DefaultComboBoxModel<String> getGenre2(){
        
        return new DefaultComboBoxModel<>(SetupFile.GENRE_2);
        
    }
    public static DefaultComboBoxModel<String> getGenre3(){
        
        return new DefaultComboBoxModel<>(SetupFile.GENRE_3);
        
    }
    
    public static DefaultComboBoxModel<String> getStudio(){
        
        return new DefaultComboBoxModel<>(SetupFile.STUDIO);
        
    }
    
    public static DefaultComboBoxModel<String> getDvdSet(){
        
        return new DefaultComboBoxModel<>(SetupFile.DVDSET);
        
    }
    
    public static DefaultComboBoxModel<Integer> getDiscSet(){
        
        return new DefaultComboBoxModel<>(SetupFile.DISC_SET);
        
    }
    public static DefaultComboBoxModel<Integer> getYearReleased(){
        
        return (new DefaultComboBoxModel<>(SetupFile.YEAR_LIST));
        
    }
    
    public static DefaultComboBoxModel<String> getSeries(){
        
        return (new DefaultComboBoxModel<>(SetupFile.SERIES));
        
    }
    
    public static DefaultComboBoxModel<String> getEpisodes(){
        
        return (new DefaultComboBoxModel<>(SetupFile.EPISODES) );
        
    }
        
     public static Integer[] calculateYearList(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR); // produces current year
        
        int arraySize = SetupFile.YEAR_LIST_SIZE;
        Integer[] yearArray = new Integer[arraySize];
        for (int i= 0 ; i < arraySize; i++)
        {
            yearArray[i] = year -i;
            
        }
        return (yearArray);
        
    }   
    
    
    private static DefaultComboBoxModel<String> dvdFormatTypes()
    {
        
        String[] dropDownList = { "Film (US)", "Film(UK)", "Film (European)", "Film (Foreign)", "Boxset (US)", "Boxset (UK)"};
        
        
        DefaultComboBoxModel<String> format = new DefaultComboBoxModel<>(dropDownList);
        
        
        return format;
        
        
    }
    
    public static DefaultComboBoxModel<String> getDvdFormat()
    {
        return SetupFile.dvdFormat;
        
    }
    
    
    }
            
    

