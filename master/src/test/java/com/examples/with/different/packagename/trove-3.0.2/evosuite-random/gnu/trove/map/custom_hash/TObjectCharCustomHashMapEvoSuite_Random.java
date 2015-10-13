/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.custom_hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TObjectCharMap;
import gnu.trove.map.custom_hash.TObjectCharCustomHashMap;
import gnu.trove.map.hash.TObjectCharHashMap;
import gnu.trove.strategy.HashingStrategy;
import gnu.trove.strategy.IdentityHashingStrategy;
import java.util.AbstractMap;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TObjectCharCustomHashMapEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
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


//   @Test
//   public void test0()  throws Throwable  {
//       TObjectCharHashMap<TObjectCharCustomHashMap<Object>> tObjectCharHashMap0 = new TObjectCharHashMap<TObjectCharCustomHashMap<Object>>();
//       IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
//       AbstractMap.SimpleEntry<Object, IdentityHashingStrategy<Object>> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, IdentityHashingStrategy<Object>>((Object) tObjectCharHashMap0, identityHashingStrategy0);
//       int int0 = 205;
//       TObjectCharCustomHashMap<Character> tObjectCharCustomHashMap0 = new TObjectCharCustomHashMap<Character>((HashingStrategy<? super Character>) identityHashingStrategy0, int0);
//       tObjectCharCustomHashMap0.capacity();
//       int int1 = abstractMap_SimpleEntry0.hashCode();
//       assertEquals(1824898305, int1);
//   }

  @Test
  public void test1()  throws Throwable  {
      IdentityHashingStrategy<Integer> identityHashingStrategy0 = null;
      char char0 = '8';
      Character character0 = new Character(char0);
      TObjectCharCustomHashMap<String> tObjectCharCustomHashMap0 = new TObjectCharCustomHashMap<String>();
      int int0 = 242;
      float float0 = 0.5F;
      TObjectCharHashMap<String> tObjectCharHashMap0 = new TObjectCharHashMap<String>(int0, float0);
      tObjectCharCustomHashMap0.putAll((TObjectCharMap<? extends String>) tObjectCharHashMap0);
      Object object0 = null;
      tObjectCharCustomHashMap0.contains(object0);
      AbstractMap.SimpleEntry<IdentityHashingStrategy<Integer>, Character> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<IdentityHashingStrategy<Integer>, Character>(identityHashingStrategy0, character0);
      int int1 = abstractMap_SimpleEntry0.hashCode();
      assertFalse(int1 == int0);
  }

  @Test
  public void test2()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      String string0 = "";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0);
      int int0 = (-1192);
      TObjectCharCustomHashMap<IdentityHashingStrategy<Integer>> tObjectCharCustomHashMap0 = new TObjectCharCustomHashMap<IdentityHashingStrategy<Integer>>((HashingStrategy<? super IdentityHashingStrategy<Integer>>) identityHashingStrategy0, int0);
      IdentityHashingStrategy<Integer> identityHashingStrategy1 = new IdentityHashingStrategy<Integer>();
      // Undeclared exception!
      try {
        tObjectCharCustomHashMap0.setAutoCompactionFactor((float) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -1192.0
         //
      }
  }
}
