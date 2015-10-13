/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedRandomAccessFloatList;
import gnu.trove.list.TFloatList;
import gnu.trove.list.array.TFloatArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedRandomAccessFloatListEvoSuite_Branch {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.loadLogbackForEvoSuite(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedRandomAccessFloatList.<init>(Lgnu/trove/list/TFloatList;Ljava/lang/Object;)V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedRandomAccessFloatList.<init>(Lgnu/trove/list/TFloatList;)V: root-Branch
   * 3 gnu.trove.impl.sync.TSynchronizedRandomAccessFloatList.subList(II)Lgnu/trove/list/TFloatList;: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TFloatArrayList tFloatArrayList0 = new TFloatArrayList();
      TSynchronizedRandomAccessFloatList tSynchronizedRandomAccessFloatList0 = new TSynchronizedRandomAccessFloatList((TFloatList) tFloatArrayList0);
      TSynchronizedRandomAccessFloatList tSynchronizedRandomAccessFloatList1 = (TSynchronizedRandomAccessFloatList)tSynchronizedRandomAccessFloatList0.subList(5, 5);
      assertNotNull(tSynchronizedRandomAccessFloatList1);
      assertEquals("{}", tSynchronizedRandomAccessFloatList1.toString());
  }
}
