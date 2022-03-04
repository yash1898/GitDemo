package mavenproject.staging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Object> li;
        int[] arr= {34,1,23,90,100,34,54,67,34,89,12};
        li=Arrays.stream(arr).boxed().collect(Collectors.toList());
        li.stream().forEach(e->System.out.println(e));
        
    }
}
