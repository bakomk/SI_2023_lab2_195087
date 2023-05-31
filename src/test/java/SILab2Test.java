import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void everyStatementAndEveryBranchTest(){
        RuntimeException runtimeException;
        List<String> EmptyList = Collections.<String>emptyList();
        List<String> list1=new ArrayList<String>();
        list1.addAll(Arrays.asList("0","0","0"));
        List<String> inputList=new ArrayList<String>();
        inputList.addAll(Arrays.asList("0","#","0","#","0","#","0","#","0"));
        List<String> expected=new ArrayList<String>();
        expected.addAll(Arrays.asList("2","#","2","#","4","#","2","#","2"));


        runtimeException=assertThrows(RuntimeException.class,() -> SILab2.function(EmptyList));
        assertTrue(runtimeException.getMessage().contains("List length should be greater than 0"));

        runtimeException=assertThrows(RuntimeException.class,() -> SILab2.function(list1));
        assertTrue(runtimeException.getMessage().contains("List length should be a perfect square"));

        assertEquals(expected,SILab2.function(inputList));
    }


}