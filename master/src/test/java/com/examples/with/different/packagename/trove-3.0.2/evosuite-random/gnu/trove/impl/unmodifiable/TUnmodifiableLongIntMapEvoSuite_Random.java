/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongIntMap;
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableLongIntMapEvoSuite_Random {

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


  @Test
  public void test0()  throws Throwable  {
      long[] longArray0 = new long[9];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = 1L;
      longArray0[1] = long1;
      long long2 = 0L;
      longArray0[2] = long2;
      long long3 = 0L;
      longArray0[3] = long3;
      long long4 = 1293L;
      longArray0[4] = long4;
      long long5 = 52L;
      longArray0[5] = long5;
      long long6 = 1246L;
      longArray0[6] = long6;
      long long7 = 1846L;
      longArray0[7] = long7;
      long long8 = 64L;
      longArray0[8] = long8;
      int[] intArray0 = new int[8];
      int int0 = 1126;
      intArray0[0] = int0;
      int int1 = Integer.MAX_VALUE;
      intArray0[1] = int1;
      int int2 = Integer.MIN_VALUE;
      intArray0[2] = int2;
      int int3 = (-1);
      intArray0[3] = int3;
      int int4 = 900;
      intArray0[4] = int4;
      int int5 = 1;
      intArray0[5] = int5;
      int int6 = 0;
      intArray0[6] = int6;
      int int7 = Integer.MIN_VALUE;
      intArray0[7] = int7;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.adjustValue((long) int5, int5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = 208L;
      longArray0[0] = long0;
      long long1 = 801L;
      longArray0[1] = long1;
      long long2 = 0L;
      longArray0[2] = long2;
      int[] intArray0 = new int[8];
      int int0 = 1968;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = 18366923;
      intArray0[2] = int2;
      int int3 = 163;
      intArray0[3] = int3;
      int int4 = 138;
      intArray0[4] = int4;
      int int5 = 0;
      intArray0[5] = int5;
      int int6 = 0;
      intArray0[6] = int6;
      int int7 = (-900);
      intArray0[7] = int7;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      String string0 = tUnmodifiableLongIntMap0.toString();
      assertEquals("{801=0, 208=1968, 0=18366923}", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      long[] longArray0 = new long[4];
      long long0 = (-897L);
      longArray0[0] = long0;
      long long1 = 379L;
      longArray0[1] = long1;
      long long2 = 1L;
      longArray0[2] = long2;
      long long3 = (-1L);
      longArray0[3] = long3;
      int[] intArray0 = new int[5];
      int int0 = (-1);
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = (-948);
      intArray0[0] = int1;
      intArray0[1] = int2;
      intArray0[2] = int2;
      intArray0[3] = int0;
      int int3 = 0;
      intArray0[4] = int3;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      intArray0[2] = int2;
      int int4 = 73;
      intArray0[3] = int4;
      int int5 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.remove((long) intArray0[3]);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      tUnmodifiableLongIntMap0.toString();
      TLongIntMap tLongIntMap0 = null;
      TLongIntHashMap tLongIntHashMap2 = null;
      try {
        tLongIntHashMap2 = new TLongIntHashMap(tLongIntMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 9183457;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.adjustValue((long) int0, int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = (-1951);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tUnmodifiableLongIntMap0);
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap1.putAll((TLongIntMap) tUnmodifiableLongIntMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      float float0 = 6.6360896E8F;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, float0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      tUnmodifiableLongIntMap0.values();
      tUnmodifiableLongIntMap0.keySet();
      int int1 = 882;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int1);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap1.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      long long0 = 0L;
      int int0 = 1027;
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.adjustValue(long0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = (-1);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      String string0 = "";
      File file0 = new File(string0, string0);
      File file1 = file0.getCanonicalFile();
      URI uRI0 = file1.toURI();
      URI uRI1 = uRI0.resolve(string0);
      String string1 = uRI1.getAuthority();
      boolean boolean0 = tUnmodifiableLongIntMap0.equals((Object) string1);
      assertEquals(false, boolean0);
      
      tLongIntHashMap0.keySet();
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap1.putIfAbsent((long) int0, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 489407;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, int0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      String string0 = "";
      String string1 = "Order not changed after insert";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string1, string0, int0, string1, string1, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: ://Order%20not%20changed%20after%20insert@:489407Order%20not%20changed%20after%20insert?Order%20not%20changed%20after%20insert#
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = 666L;
      longArray0[1] = long1;
      int[] intArray0 = new int[7];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = (-1567);
      intArray0[1] = int1;
      int int2 = 1414;
      intArray0[2] = int2;
      int int3 = (-7);
      intArray0[3] = int3;
      int int4 = 1440;
      intArray0[4] = int4;
      int int5 = (-2020);
      intArray0[5] = int5;
      int int6 = 60;
      intArray0[6] = int6;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      int int7 = tUnmodifiableLongIntMap0.size();
      assertEquals(2, int7);
  }

  @Test
  public void test11()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      tUnmodifiableLongIntMap0.getNoEntryKey();
      tUnmodifiableLongIntMap0.keys(tLongIntHashMap0._set);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      tUnmodifiableLongIntMap1.valueCollection();
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap1.putAll((TLongIntMap) tLongIntHashMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = (-1899L);
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      long long2 = (-476L);
      longArray0[2] = long2;
      long long3 = 0L;
      longArray0[3] = long3;
      long long4 = 156L;
      longArray0[4] = long4;
      long long5 = (-1274L);
      longArray0[5] = long5;
      long long6 = 995L;
      longArray0[6] = long6;
      long long7 = 0L;
      longArray0[7] = long7;
      int[] intArray0 = new int[9];
      int int0 = 199;
      intArray0[0] = int0;
      int int1 = 107;
      intArray0[1] = int1;
      int int2 = (-781);
      intArray0[2] = int2;
      int int3 = 1799;
      intArray0[3] = int3;
      int int4 = (-907);
      intArray0[4] = int4;
      int int5 = 569;
      intArray0[5] = int5;
      int int6 = 1965;
      intArray0[6] = int6;
      int int7 = 0;
      intArray0[7] = int7;
      int int8 = (-955);
      intArray0[8] = int8;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      tUnmodifiableLongIntMap0.keys();
      int int9 = 168;
      TLongIntMap tLongIntMap0 = null;
      TLongIntHashMap tLongIntHashMap1 = null;
      try {
        tLongIntHashMap1 = new TLongIntHashMap(tLongIntMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TLongIntMap tLongIntMap0 = null;
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = null;
      try {
        tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap(tLongIntMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      int int0 = 867;
      float float0 = 0.0F;
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tUnmodifiableLongIntMap0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int0, float0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap2 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap1);
      int int1 = tUnmodifiableLongIntMap2.size();
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap1.remove((long) int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 134;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      long long0 = 0L;
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.adjustOrPutValue(long0, int0, int1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = 1599L;
      longArray0[1] = long1;
      int[] intArray0 = new int[4];
      int int0 = 554;
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      int int1 = 2003;
      intArray0[3] = int1;
      int int2 = (-1040);
      intArray0[0] = int2;
      int int3 = 4481;
      longArray0[0] = (long) int3;
      longArray0[1] = long1;
      intArray0[1] = int3;
      int int4 = (-1);
      intArray0[2] = int4;
      int int5 = 0;
      intArray0[3] = int5;
      int int6 = (-1755);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int6);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap1 = new TUnmodifiableLongIntMap((TLongIntMap) tUnmodifiableLongIntMap0);
      int int7 = (-1859);
      tUnmodifiableLongIntMap1.containsValue(int7);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(longArray0, intArray0);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap1);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap2 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap2);
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap2.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = 999L;
      longArray0[0] = long0;
      long long1 = 265L;
      longArray0[1] = long1;
      long long2 = 0L;
      longArray0[2] = long2;
      int[] intArray0 = new int[7];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 0;
      intArray0[1] = int1;
      int int2 = 18;
      intArray0[2] = int2;
      int int3 = 24;
      intArray0[3] = int3;
      int int4 = (-904);
      intArray0[4] = int4;
      int int5 = (-2029);
      intArray0[5] = int5;
      int int6 = 1759;
      intArray0[6] = int6;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TUnmodifiableLongIntMap tUnmodifiableLongIntMap0 = new TUnmodifiableLongIntMap((TLongIntMap) tLongIntHashMap0);
      long long3 = 1L;
      int int7 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableLongIntMap0.adjustOrPutValue(long3, int2, int7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
