package gettingweather;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GettingWeather {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    public static void main(String[] args) throws IOException, InterruptedException {
        
        
        String a = "curl -4 http://wttr.in/grenoble";
        Process proc = Runtime.getRuntime().exec(a);
        
            BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(ANSI_YELLOW + line + "\n" + ANSI_RED);
        }

        proc.waitFor();   

    }
    
    
}
    

